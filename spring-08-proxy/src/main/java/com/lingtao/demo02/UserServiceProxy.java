package com.lingtao.demo02;

/**
 * Created by lingtao on 2020/4/12 14:23
 **/
public class UserServiceProxy implements UserService{

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void add() {
        userService.add();
    }

    public void delete() {
        userService.delete();
    }

    public void update() {
        userService.update();
    }

    public void query() {
        userService.query();
    }

    public void log(String msg){
        System.out.println("使用了"+msg+"方法");
    }
}
