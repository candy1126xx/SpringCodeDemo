package main.declare_parents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
// 启用自动代理
@EnableAspectJAutoProxy
@ComponentScan
public class ConcertConfig {

    // 目标和源都要声明为bean
    @Bean
    public Performance performer(){
        return new Performer();
    }

    @Bean
    public EncoreableIntroducer introducer(){
        return new EncoreableIntroducer();
    }
}
