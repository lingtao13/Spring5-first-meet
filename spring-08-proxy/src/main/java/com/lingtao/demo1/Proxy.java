package com.lingtao.demo1;

/**
 * Created by lingtao on 2020/4/12 0:47
 **/
public class Proxy implements Rent{
    private Host host;

    public Proxy() {
    }

    public Proxy(Host host) {
        this.host=host;
        seeHouse();
        fee();
        contract();
    }

    public void seeHouse(){
        System.out.println("中介帮你看房");
    }

    @Override
    public void rent() {
        host.rent();
    }

    public void fee(){
        System.out.println("收中介费");
    }

    public void contract(){
        System.out.println("签合同");
    }
}
