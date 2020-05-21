package main.property_source;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class WhiteDisc {

    private String title;

    // 用Value标记属性
    public WhiteDisc(@Value("${disc.white}") String title){
        this.title = title;
    }

    public void play(){
        System.out.println(title+"is playing");
    }
}
