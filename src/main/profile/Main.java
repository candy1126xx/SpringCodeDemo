package main.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        // 通过设置profile，实现在不同环境应用不同的实现类
        // 在SpringMVC中，在wep.xml文件中设置
        // 本项目忽略IDEA的profile panel
        ConfigurableEnvironment environment = context.getEnvironment();
        environment.setDefaultProfiles("dev"); // 默认dev
        // environment.setActiveProfiles("prod"); // 激活prod
        // environment.addActiveProfile("dev"); // 同时激活dev、prod，此时Movie有2个实现类，会冲突
        context.setEnvironment(environment);
        context.register(MovieConfig.class);
        context.refresh();
        // 获取组件实例，填入的是配置类中bean的ID
        Movie movie = context.getBean(Movie.class);
        movie.play();
        // 关闭容器
        context.close();
    }
}
