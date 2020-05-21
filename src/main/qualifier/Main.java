package main.qualifier;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Qualifier解决歧义
// 1.需要注入的方法标记Qualifier
// 2.用Qualifier标记实体类，或者标记bean方法
// 自定义Qualifier
// 1.自定义继承自Qualifier的注解BigCake
// 2.需要注入的方法标记BigCake
// 3.用BigCake标记实体类，或者标记bean方法
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(LunchConfig.class);
        context.refresh();
        // Dessert有2个实现类
        // 必须为其中之一指定Primary，否则会冲突
        // 可以在Class、Bean方法、xml中指定Primary
        Lunch lunch = (Lunch) context.getBean("lunch");
        lunch.start();
        // 关闭容器
        context.close();
    }
}
