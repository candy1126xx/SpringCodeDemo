package main.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// 标记为组件，实例化过程交给Spring
// 实例化时会自动调用构造方法和所有@Autowired方法
// 使用默认ID第一个字母小写cDPlayer
@Component
// @Component("自定义ID")
public class CDPlayer {

    private CD cd;

    // 向CDPlayer自动装配CD
    @Autowired
    public CDPlayer(CD cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }

}
