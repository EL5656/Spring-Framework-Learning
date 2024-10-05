package org.example.Development;

public class Dev {
    private int age;

    public Dev(int age) {
        this.age = age;
        System.out.println("Dev1 Constructor");
    }

    public Dev(){
        System.out.println("Dev Constructor");
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void build(){
        System.out.println("working on awesome project");
    }
}
