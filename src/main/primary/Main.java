package main.primary;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Primary解决歧义
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(DessertConfig.class);
        context.refresh();
        // Dessert有2个实现类
        // 必须为其中之一指定Primary，否则会冲突
        // 可以在Class、Bean方法、xml中指定Primary
        Dessert dessert = context.getBean(Dessert.class);
        dessert.eat();
        // 关闭容器
        context.close();
    }
}
