package main.primary;

// 在类上标记Primary
// @Primary
public class IceCream implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating ice cream");
    }
}
