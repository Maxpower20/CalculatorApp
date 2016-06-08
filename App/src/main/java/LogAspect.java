
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAspect {

    public void onExecute(ProceedingJoinPoint pjp) throws Throwable {

        Logger logger = Logger.getLogger(pjp.getTarget().getClass());
        logger.info(pjp.getSignature().getName() + " is called");
        pjp.proceed();
    }
}
