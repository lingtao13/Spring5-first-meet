package com.lingtao.pojo;

/**
 * Created by lingtao on 2020/4/6 21:33
 **/
public class UseT {
    private String name;

    public UseT() {
        System.out.println("UseT's none parameter constructor");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show(){
        System.out.println("name="+name);
    }
}
