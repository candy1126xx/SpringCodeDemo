package main.profile;

import org.springframework.stereotype.Component;

@Component
public class ProdMovie implements Movie {

    @Override
    public void play() {
        System.out.println("Prod Movie Playing");
    }
}
