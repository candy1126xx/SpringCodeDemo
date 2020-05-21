package main.qualifier;

// 用BigCake标记实体类；用这个，IDEA会代码检查错误，但是可以运行
// @BigCake
public class Cake implements Dessert {
    @Override
    public void eat() {
        System.out.println("eating cake");
    }
}
