import com.itheima.config.SpringConfig;
import com.itheima.dao.AccountDao;
import com.itheima.tomain.Account;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @description:
 * @time: 3/11/2022 21:26
 */
public class App2 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountDao bean = ctx.getBean(AccountDao.class);
        Account byId = bean.findById(1);

        System.out.println(byId);
    }
}

