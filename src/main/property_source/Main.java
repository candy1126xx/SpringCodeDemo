package main.property_source;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 使用属性源文件注入字符串
// 1.写属性源文件
// 2.用@PropertySource标记配置类，指明属性源文件路径
// 3.调用Environment.getXXX读取字符串(BlankDisc)
// 4.或者使用@Value(...)
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(BlankDiscConfig.class);
        context.register(WhiteDiscConfig.class);
        context.refresh();
        // 获取组件实例，填入的是配置类中bean的ID
        BlankDisc blankDisc = context.getBean(BlankDisc.class);
        WhiteDisc whiteDisc = context.getBean(WhiteDisc.class);
        blankDisc.play();
        whiteDisc.play();
        // 关闭容器
        context.close();
    }
}
