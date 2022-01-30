package com.kv.spring;

public class AutowireSeva {
    private int autowireInt;
    private InterfaceSeva seva;

    public AutowireSeva(int autowireInt) {
        this.autowireInt = autowireInt;
    }

    public AutowireSeva() {
    }

    public int getAutowireInt() {
        return autowireInt;
    }

    public void setAutowireInt(int autowireInt) {
        this.autowireInt = autowireInt;
    }

    public InterfaceSeva getSeva() {
        return seva;
    }

    public void setSeva(InterfaceSeva seva) {
        this.seva = seva;
    }

    public void printMethod() {
        System.out.println("Autowire  " + this.autowireInt);
        seva.printAttributeMethod();
    }
}
