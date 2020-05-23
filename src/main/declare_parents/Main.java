package main.declare_parents;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// @DeclareParents向目标增加新方法
// 1.写目标bean、源bean
// 2.定义切面
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(ConcertConfig.class);
        context.refresh();
        // 获取组件实例，填入的是配置类中bean的ID
        Performance performer = context.getBean(Performance.class);
        performer.perform();
        // 强转即可调用源bean的方法
        ((Encoreable)performer).performEncore();
        // 关闭容器
        context.close();
    }
}
