package main.conditional;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// 条件化创建Bean
// 为Bean方法标记@Conditional
// 如果GoodCondition的match()返回false，则无法创建对应的bean，会报错
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(MovieConfig.class);
        context.refresh();
        // 获取组件实例，填入的是配置类中bean的ID
        Movie movie = (Movie) context.getBean("movie");
        movie.play();
        // 关闭容器
        context.close();
    }
}
