package org.learn;

public class HelloWorld {

   // private HelloRobert helloRobert;

    private int age;

    public HelloWorld() {
        System.out.println("HelloWorld- Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void build() {
        System.out.println("Working on spring framework project!");
      //  helloRobert.compile();
    }
}
