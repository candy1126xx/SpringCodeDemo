package main.primary;

// 方法1：在类上标记@Primary
// @Primary
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating ice cream");
    }
}
