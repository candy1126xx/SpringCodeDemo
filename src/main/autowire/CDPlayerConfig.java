package main.autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// 标记为配置类
@Configuration
// 开启组件扫描，所在包为基础包
@ComponentScan
// @ComponentScan("自定义基础包名")
// @ComponentScan(basePackages="自定义基础包名")
// @ComponentScan(basePackages={"自定义基础包名1", "自定义基础包名2"})
// @ComponentScan(basePackageClasses={"自定义基础包中类1", "自定义基础包中类2"})
public class CDPlayerConfig {
}
