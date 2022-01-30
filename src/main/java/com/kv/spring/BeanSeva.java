package com.kv.spring;

public class BeanSeva implements InterfaceSeva{
    private int beanInt;
    private Laptop laptop;

//    default constructor
    public BeanSeva() {
        System.out.println("BeanSeva constructor");
    }

//    parameterized constructor
    public BeanSeva(int beanInt) {
        this.beanInt = beanInt;
    }

    public BeanSeva(int beanInt, Laptop laptop) {
        this.beanInt = beanInt;
        this.laptop = laptop;
    }

    public int getBeanInt() {
        return beanInt;
    }

    public void setBeanInt(int beanInt) {
        this.beanInt = beanInt;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void printInt() {
        System.out.println("bean int = " + this.beanInt);
    }

    public void printAttributeMethod() {
        System.out.println("bean int = " + this.beanInt);
        laptop.printAttributeMethod();
    }

}
