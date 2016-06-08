import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.io.IOException;


public class Bootstrap {
    public static void main(String[] args) throws IOException {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml","aop-context.xml");
        Executor executor = applicationContext.getBean("executor", Executor.class);

        executor.execute();
    }
}
