package org.learn.XMLBasedBeanLF;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppXML {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MyBean myBean = (MyBean) context.getBean("myBeanXML");
        myBean.display();

        context.close();
    }
}
