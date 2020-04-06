package com.lingtao.pojo;

/**
 * Created by lingtao on 2020/4/6 20:33
 **/
public class User {
    private String name;

    public User(String name) {
        this.name = name;
        System.out.println("User's parameter constructor");
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
