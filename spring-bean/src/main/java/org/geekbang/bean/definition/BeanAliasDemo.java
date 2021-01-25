package org.geekbang.bean.definition;

import org.geekbang.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAliasDemo {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:/META-INF/bean-definition-context.xml");
        User user = (User) beanFactory.getBean("user");
        User felixUser = (User) beanFactory.getBean("felixUser");
        System.out.println(user == felixUser);
    }

}
