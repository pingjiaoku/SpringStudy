
import com.itheima.dao.BookDao;
import com.itheima.service.BookService;
import com.itheima.test.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;
import java.util.Scanner;

/**
 * @description:
 * @time: 1/11/2022 14:51
 */





public class MainTest {
    public static void main(String[] args) {
        // 获取aoc容器（从类路径下获取）
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // （从文件系统中获取，需要用绝对路径）
        ApplicationContext ctx2 = new FileSystemXmlApplicationContext("D:\\javaweb\\SpringTest\\SpringTest01\\src\\main\\resources\\applicationContext.xml");

        // 使用Bean名称获取
        BookDao bookDao = (BookDao) ctx2.getBean("bookDao");
        // 使用Bean名称和指定类型，与上无区别
//        BookDao bookDao1 = ctx.getBean("book", BookDao.class);
//        // 使用Bean类型获取，有缺陷，不能有多个相同的Bean类型
//        BookDao bookDao2 = ctx.getBean(BookDao.class);
//        bookDao.save();
//        bookDao1.save();
//        bookDao2.save();
//        // 手动销毁容器(立即销毁)
//        ((ClassPathXmlApplicationContext) ctx).close();
//        // 延迟销毁
//        ((ClassPathXmlApplicationContext) ctx).registerShutdownHook();

//        BookDao bookDao2 = (BookDao) ctx.getBean("Dao2");
//        BookDao bookDao3 = (BookDao) ctx.getBean("Dao3");
//        BookDao bookDao4 = (BookDao) ctx.getBean("Dao4");
//        BookDao bookDao5 = (BookDao) ctx.getBean("Dao5");


        BookService bookService = (BookService) ctx.getBean("bookService");
        System.out.println(bookDao);
        System.out.println(bookService.getBookDao());
//        bookService.save();
//        ((ClassPathXmlApplicationContext)ctx).close();


//        BookDao bookDao = (BookDao) ctx.getBean("compDaoFactory");
//        bookDao.save();


//        BookDao userDao = (BookDao) ctx.getBean("userDao");
//        userDao.save();


//        BookDao bookDao = (BookDao) ctx.getBean("userFactoryBean");
//        bookDao.save();

//        Test listTest = (Test) ctx.getBean("listTest");
//        System.out.println(listTest);

//        DataSource sou = (DataSource) ctx.getBean("druid");
//        System.out.println(sou);


//        Resource resource = new ClassPathResource("applicationContext.xml");
//        BeanFactory fac = new XmlBeanFactory(resource);
//        BookDao bookDao = (BookDao) fac.getBean("book");
//        bookDao.save();



    }
}
