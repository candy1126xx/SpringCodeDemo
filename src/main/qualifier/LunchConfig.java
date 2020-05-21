package main.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LunchConfig {

    @Bean
    // 为IceCream分配限定符为cold
    @Qualifier("cold")
    public Dessert iceCream() {
        return new IceCream();
    }

    @Bean
    // 用BigCake标记bean方法
    @BigCake
    public Dessert cake() {
        return new Cake();
    }

    @Bean
    public Lunch lunch() {
        return new Lunch();
    }
}
