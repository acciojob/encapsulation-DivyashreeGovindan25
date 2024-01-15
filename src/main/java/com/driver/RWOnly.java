package com.driver;

public class RWOnly {
    private String name;
    public void setter(String name){
        this.name = name;
    }
    public String getter(){
        return name;
    }
    @Override
    public String toString() {
        return "RWOnly [name=" + name + "]";
    }
}
