package org.learn;

public class HelloWorld {

    //private HelloRobert helloRobert;

    private HelloMain helloMain;

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

    /**
    public HelloWorld(HelloRobert helloRobert){
        this.helloRobert = helloRobert;
        System.out.println("HelloWorld from parameterized constructor Injection..");
    }
     **/

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    /**
    public HelloRobert getHelloRobert() {
        return helloRobert;
    }

    public void setHelloRobert(HelloRobert helloRobert) {
        this.helloRobert = helloRobert;
    }
**/
    public HelloMain getHelloMain() {
        return helloMain;
    }

    public void setHelloMain(HelloMain helloMain) {
        this.helloMain = helloMain;
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
        helloMain.compile();
    }
}
