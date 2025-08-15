package org.learn.AnnotationBasedBeanLF;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyBeanAnnotation.class);
}
