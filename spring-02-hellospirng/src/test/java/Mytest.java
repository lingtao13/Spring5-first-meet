import com.lingtao.pojo.Hello;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

/**
 * Created by lingtao on 2020/4/6 18:42
 **/
@ExtendWith(SpringExtension.class)
public class Mytest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //我们的对象现在都在Spring中管理了,我们要使用,直接去里面取出来就可以了!
        Hello bean = (Hello) context.getBean("hello");
        System.out.println(bean.toString());
    }
}
