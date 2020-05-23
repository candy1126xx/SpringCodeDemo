package main.property_source;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
// 属性源文件
@PropertySource("/main/app.properties")
public class BlankDiscConfig {

    @Autowired
    Environment env;

    @Bean
    public BlankDisc blankDisc(){
        // 从属性源文件中读出字符串
        // 如果属性是必须定义的，用getRequiredProperty()
        // 检查属性是否存在containsProperty()
        return new BlankDisc(env.getProperty("disc.blank", "default"));
    }
}
