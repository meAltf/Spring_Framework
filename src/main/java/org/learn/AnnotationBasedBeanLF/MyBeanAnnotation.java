package org.learn.AnnotationBasedBeanLF;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class MyBeanAnnotation {

    @PostConstruct
    public void init() {
        System.out.println("Init method called via @PostConstruct");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Destroy method called via @PreDestroy");
    }
}
