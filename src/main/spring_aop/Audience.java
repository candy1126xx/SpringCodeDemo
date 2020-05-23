package main.spring_aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

// 定义切面
@Aspect
public class Audience {

    // 定义无参数切点
    @Pointcut("execution(* main.spring_aop.Performance.perform(..))")
    public void performance() {
    }

    // 定义通知
    @After("performance()")
    public void silencePhones() {
        System.out.println("Silencing phones");
    }

    // 环绕通知多了个参数jp
    @Around("performance()")
    public Object watch(ProceedingJoinPoint jp) {
        Object result = null;
        try {
            System.out.println("waiting……");
            result = jp.proceed();
            System.out.println("Clap clap clap");
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

    // 定义有参数切点，注意trackNumber在4个地方保持一致
    @Pointcut("execution(* main.spring_aop.Performance.playTrack(int)) " +
            "&& args(trackNumber)")
    public void trackPlayed(int trackNumber) {
    }

    // 定义有参数通知
    @Before(value = "trackPlayed(trackNumber)", argNames = "trackNumber")
    public void countTrack(int trackNumber) {
        System.out.println("aspect trackNumber：" + trackNumber);
    }

    // @After：返回或异常后
    // @AfterReturning：返回后
    // @AfterThrowing：异常后
    // @Around：环绕
    // @Before：前

    // 执行顺序：Around1 -> Before -> proceed -> After -> Around2

    // 切点格式：execution(返回类型 类全限定名.方法名(参数类型) && within(包名)/bean('bean的ID')
}
