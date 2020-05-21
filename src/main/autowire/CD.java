package main.autowire;

import org.springframework.stereotype.Component;

@Component
// 单利(默认):全局共用1个bean
// @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)

// 原型：每次注入都会创建1个新的bean
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)

// 会话：为每个会话创建1个bean
// proxyMode的作用是，不会注入bean，而是注入bean的代理，这样做的原因是
// 当需要注入时，会话可能还没建立，bean是不确定的，所以先注入1个代理
// 实例化bean后，代理再把委托传给bean
// 如果bean是接口，则proxyMode = ScopedProxyMode.INTERFACE
// 如果bean是类，则proxyMode = ScopedProxyMode.TARGET_CLASS
// @Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = )

// 请求：为每个请求创建1个bean
// @Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = )
public class CD {

    public void play() {
        System.out.println("CD Playing");
    }
}
