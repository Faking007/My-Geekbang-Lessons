package org.geekbang.dependency.injection;

import org.geekbang.repository.UserRepository;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.env.Environment;

public class DependencyInjectionDemo {

    public static void main(String[] args) {
        /*配置XML文件
        * 启动 Spring 应用上下文
        * */
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/META-INF/dependency-injection-context.xml");

//        依赖来源一：自定义 Bean
        UserRepository userRepository = applicationContext.getBean("userRepository", UserRepository.class);
        System.out.println(userRepository.getUsers());

//        依赖来源二：内建依赖（非Bean）
        System.out.println(userRepository.getBeanFactory());
        System.out.println(userRepository.getObjectFactory().getObject() == applicationContext);

//        注意：依赖查找不可获取内建依赖
//        以下语句运行会报错，因为 BeanFactory为内建依赖，而非 Bean
//        System.out.println(applicationContext.getBean(BeanFactory.class));

//        依赖来源三：容器内建 Bean
        Environment environment = applicationContext.getBean(Environment.class);
        System.out.println(environment);
    }

}
