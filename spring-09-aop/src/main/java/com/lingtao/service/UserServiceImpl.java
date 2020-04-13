package com.lingtao.service;

/**
 * Created by lingtao on 2020/4/12 20:02
 **/

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("新增了一个用户");
    }

    public void delete() {
        System.out.println("删除了一个用户");
    }

    public void update() {
        System.out.println("更新了一个用户");
    }

    public void query() {
        System.out.println("查询了一个用户");
    }
}
