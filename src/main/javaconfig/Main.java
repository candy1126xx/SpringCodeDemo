package main.javaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

// Java配置装配
// 1.实体类不用标记@Component，setter()要标记@Autowired
// 2.为配置类编写Bean方法
public class Main {

    public static void main(String[] args) {
        // 用配置类启动容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(GamePlayerConfig.class);
        context.register(GameConfig.class);
        context.refresh();
        // 获取组件实例，填入的是配置类中bean的ID
        GamePlayer gamePlayer = (GamePlayer) context.getBean("gamePlayer");
        gamePlayer.play();
        // 关闭容器
        context.close();
    }
}
