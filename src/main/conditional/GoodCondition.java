package main.conditional;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class GoodCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // 检查bean定义
        BeanDefinitionRegistry registry = conditionContext.getRegistry();
        // 检查bean是否存在，查看bean的属性
        ConfigurableListableBeanFactory beanFactory = conditionContext.getBeanFactory();
        // 检查环境变量
        Environment environment = conditionContext.getEnvironment();
        // 检查资源
        ResourceLoader resourceLoader = conditionContext.getResourceLoader();
        // 检查类信息
        ClassLoader classLoader = conditionContext.getClassLoader();
        // 检查bean方法上是否有其它注解
        annotatedTypeMetadata.isAnnotated("");
        // 检查指定注解的参数
        annotatedTypeMetadata.getAnnotations();
        return true;
    }
}
