import com.itheima.dao.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import com.itheima.tomain.Account;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * @description:
 * @time: 3/11/2022 10:54
 */
public class App {
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory ssf = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession ss = ssf.openSession();

        AccountDao accountDao = ss.getMapper(AccountDao.class);

        Account ac = accountDao.findById(1);

        System.out.println(ac);

        ss.close();








//        SqlSessionFactory ssf = getConn.getSsf();
//        SqlSession sqlSession = ssf.openSession();
//        AccountMapper mapper = sqlSession.getMapper(AccountMapper.class);
//
//        List<Account> postList = mapper.GetAllAccount();
//        String s = JSON.toJSONString(postList);
//
//        System.out.println(s);
//
//        sqlSession.close();




    }
}


