import com.lics.mapper.UserMapper;
import com.lics.pojo.User;
import com.lics.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

    @Test
    public void test01() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        UserMapper mapper = (UserMapper) context.getBean("userMapper");
        List<User> users = mapper.selectUser();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
