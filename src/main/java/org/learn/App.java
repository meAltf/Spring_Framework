package org.learn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
//        HelloWorld helloWorld = new HelloWorld();
//        helloWorld.build();

        /** Using a spring framework to create an object **/
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springBean.xml");
        HelloWorld helloWorldObj = applicationContext.getBean(HelloWorld.class);
        HelloRobert helloRobertObj = applicationContext.getBean(HelloRobert.class);

        helloWorldObj.build();
        helloRobertObj.compile();
    }
}
