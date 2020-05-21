package main.declare_parents;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

// 定义切面
@Aspect
public class EncoreableIntroducer {

    // 把Encoreable接口引入Performance的所有子类
    // 也就是为Performance的所有子类增加Encoreable中声明的方法
    @DeclareParents(value = "main.declare_parents.Performance+",
            defaultImpl = DefaultEncoreable.class)
    public Encoreable encoreable;

}
