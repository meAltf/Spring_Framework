package org.learn;

public class HelloWorld {

    private HelloRobert helloRobert;

    private int age;
//    private long salary;

    public HelloWorld() {
        System.out.println("HelloWorld- Constructor");
    }

    /**
    public HelloWorld(int age, long salary) {
        this.age = age;
        this.salary = salary;
        System.out.println("HelloWorld from parameterized constructor");
    }
     **/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
     **/

    public void build() {
        System.out.println("Working on spring framework project!");
        helloRobert.compile();
    }
}
