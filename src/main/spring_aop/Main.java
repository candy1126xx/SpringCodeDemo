package main.spring_aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Spring支持的AOP
// 1.把实体类定义为切面
// 2.用@EnableAspectJAutoProxy标记配置类
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConcertConfig.class);
        context.refresh();
        // 获取组件实例，填入的是配置类中bean的ID
        Performance performer = context.getBean(Performance.class);
        performer.perform();
        performer.playTrack(666);
        // 关闭容器
        context.close();
    }
}
