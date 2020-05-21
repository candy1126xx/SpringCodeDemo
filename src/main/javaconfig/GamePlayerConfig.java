package main.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 如果需要xml配置的bean
// @ImportResource("xml路径")
public class GamePlayerConfig {

    @Bean
    // Game的Bean方法在别的类中，Spring也可以自动完成工作
    public GamePlayer gamePlayer(Game game) {
        return new GamePlayer(game);
    }
}
