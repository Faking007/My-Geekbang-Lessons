package org.geekbang.repository;

import java.util.List;
import lombok.Data;
import org.geekbang.domain.User;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.ObjectFactory;
import org.springframework.context.ApplicationContext;

@Data
public class UserRepository {

    private List<User> users;

    private BeanFactory beanFactory;

    private ObjectFactory<ApplicationContext> objectFactory;

}
