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

        HelloWorld helloWorldObj = (HelloWorld) applicationContext.getBean("helloWorld");
       // helloWorldObj.setAge(22);
        System.out.println(helloWorldObj.getAge());
        System.out.println(helloWorldObj.getSalary());
        //helloWorldObj.build();


        // HelloRobert helloRobertObj = (HelloRobert) applicationContext.getBean("helloRobert");
        //helloRobertObj.compile();


    }
}
