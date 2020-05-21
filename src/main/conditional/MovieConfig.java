package main.conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MovieConfig {

    @Bean
    @Conditional(GoodCondition.class)
    public Movie movie(){
        return new Movie();
    }
}
