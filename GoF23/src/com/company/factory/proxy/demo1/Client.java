package com.company.factory.proxy.demo1;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //代理 中介帮房东租房子 一般会有附属操作
        Proxy proxy = new Proxy(host);
        //你不用面对房东 直接找中介即可
        proxy.rent();
    }
}
