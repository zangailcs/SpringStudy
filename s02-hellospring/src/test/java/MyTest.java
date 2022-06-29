import com.lics.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        // 获取spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        // 我们的对象现在都在Spring中管理了，要使用时，直接取出来
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
    }
}
