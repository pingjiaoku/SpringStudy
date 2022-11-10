package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.*;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountMapper {
    @Select("select * from tbl_account")
    List<Account> FindAllAccount();

    @Select("select * from tbl_account where id=#{id}")
    Account FindAccountById(Integer id);

    @Insert("insert into tbl_account(name, money) values (#{name}, #{money})")
    void AddAccount(Account acc);


    void UpdateAccount(Account acc);

    @Update("update tbl_account set money=money+#{money} where id=#{id}")
    void Transfer(@Param("id") Integer id,@Param("money") Long money);

    @Delete("delete from tbl_account where id=#{id}")
    void DeleteAccountById(@Param("id") Integer id);

}
