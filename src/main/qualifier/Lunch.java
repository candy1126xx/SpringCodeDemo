package main.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Lunch {

    private Dessert dessert;

    @Autowired
    // 指定注入的是限定符为cold的bean
    // @Qualifier("cold")
    // 指定注入的是用BigCake标记的bean
    @BigCake
    public void setDessert(Dessert dessert) {
        this.dessert = dessert;
    }

    public void start(){
        dessert.eat();
    }
}
