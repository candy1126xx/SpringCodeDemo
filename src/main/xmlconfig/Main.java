package main.xmlconfig;

import org.springframework.context.support.FileSystemXmlApplicationContext;

// xml配置装配
// 实体类不用任何标记
// 构造参数注入：
// 1.实体类中写构造方法
// 2.xml文件中使用<constructor-args>
// 属性注入：
// 1.实体类中写setter()
// 2.xml文件中使用<property>
public class Main {

    public static void main(String[] args) {
        // 用配置文件启动容器，路径要从src开始
        FileSystemXmlApplicationContext context = new FileSystemXmlApplicationContext("src/main/xmlconfig/music_config.xml");
        context.refresh();
        // 获取组件实例，填入的是xml中bean的id
        MusicPlayer musicPlayer = (MusicPlayer) context.getBean("musicPlayer");
        musicPlayer.play();
        // 关闭容器
        context.close();
    }
}
