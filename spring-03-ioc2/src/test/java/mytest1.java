import com.lingtao.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by lingtao on 2020/4/6 20:37
 **/
public class mytest1 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        User user = context.getBean("user",User.class);
        user.show();
    }
}
