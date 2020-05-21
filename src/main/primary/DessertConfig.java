package main.primary;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DessertConfig {

    @Bean
    // 在Bean方法上标记Primary
    @Primary
    public Dessert iceCream(){
        return new IceCream();
    }

    @Bean
    public Dessert cake(){
        return new Cake();
    }
}
