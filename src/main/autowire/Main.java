package main.autowire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 自动装配
// 1.实体类标记Component，构造方法和setter()要标记Autowired
// 2.配置类标记ComponentScan
// 3.实体类中需要注入的方法标记Autowired
// 声明bean声明周期3种方式
// 1.Scope标记在类
// 2.Scope标记在bean方法
// 3.xml中使用<bean>下的scope属性
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(CDPlayerConfig.class);
        context.refresh();
        // 获取组件实例
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
        // 关闭容器
        context.close();
    }
}
