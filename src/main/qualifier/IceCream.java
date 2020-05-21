package main.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;

// 为IceCream分配限定符为cold
// @Qualifier("cold")
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating ice cream");
    }
}
