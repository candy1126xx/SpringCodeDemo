package main.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @Qualifier解决歧义
// 1.需要注入的方法标记@Qualifier
// 2.用@Qualifier标记实体类，或者bean方法
// 自定义@Qualifier
// 1.自定义继承自@Qualifier的注解@BigCake
// 2.需要注入的方法标记@BigCake
// 3.用@BigCake标记实体类，或者标记bean方法
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(LunchConfig.class);
        context.refresh();
        // 获取bean
        Lunch lunch = (Lunch) context.getBean("lunch");
        lunch.start();
        // 关闭容器
        context.close();
    }
}
