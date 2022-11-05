
import com.itheima.config.SpringConfig;
import com.itheima.dao.BookDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;

/**
 * @description:
 * @time: 1/11/2022 14:51
 */





public class MainTest {
    public static void main(String[] args) {
        // 加载配置类
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);

        // 通过名字获取Bean
        BookDao bookDao = (BookDao) ctx.getBean("bookDao2");
        bookDao.save();
        System.out.println(bookDao.getClass());
//        // 通过类型获取Bean
//        BookDao bookDao2 = ctx.getBean(BookDao.class);
//        bookDao.save();
//        bookDao2.save();
//        ctx.close();


//        BookService bookService = ctx.getBean(BookService.class);
//        bookService.save();

//        BookDao bookDao = (BookDao) ctx.getBean("bookDao2");
//        bookDao.save();

//        DataSource dataSource = ctx.getBean(DataSource.class);
//        System.out.println(dataSource);

    }
}
