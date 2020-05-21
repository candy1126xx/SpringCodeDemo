package main.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {

    // 创建实例的Bean方法，默认ID为方法名game
    @Bean
    // @Bean(name = "自定义ID")
    public Game game() {
        return new Game();
    }

    @Bean
    public NPC npc() {
        return new NPC();
    }
}
