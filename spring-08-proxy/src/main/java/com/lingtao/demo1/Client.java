package com.lingtao.demo1;

/**
 * Created by lingtao on 2020/4/12 0:46
 **/
public class Client {
    public static void main(String[] args) {
        Host host=new Host();
        Proxy proxy=new Proxy(host);
        proxy.rent();
    }
}
