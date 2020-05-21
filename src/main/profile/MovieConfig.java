package main.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
// 标记在类上，控制该类的所有bean方法
// @Profile("dev")
public class MovieConfig {

    @Bean(name = "devMovie")
    // 标记在方法上
    @Profile("dev")
    public Movie devMovie(){
        return new DevMovie();
    }

    @Bean
    @Profile("prod")
    public Movie prodMovie(){
        return new ProdMovie();
    }
}
