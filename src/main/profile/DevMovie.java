package main.profile;

import org.springframework.stereotype.Component;

@Component
public class DevMovie implements Movie {

    @Override
    public void play() {
        System.out.println("Dev Movie Playing");
    }
}
