package org.example.Development;

public class Dev {
    private Laptop laptop;//reference object
    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public Dev(){
        System.out.println("Dev Constructor");
    }

    public void build(){
        System.out.println("working on awesome project");
        laptop.compile();
    }
}
