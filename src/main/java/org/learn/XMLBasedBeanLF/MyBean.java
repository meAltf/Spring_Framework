package org.learn.XMLBasedBeanLF;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MyBean implements InitializingBean, DisposableBean {

    private String message;

    public MyBean(String message) {
        this.message = message;
    }

    public void display() {
        System.out.println("Message: " + message);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Custom destroy logic before bean is removed.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Custom init logic after properties are set.");
    }
}
