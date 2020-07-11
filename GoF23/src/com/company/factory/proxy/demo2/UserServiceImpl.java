package com.company.factory.proxy.demo2;

//真实对象
public class UserServiceImpl implements UserService {
    @Override
    public void add() {
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        System.out.println("更改了一个用户");
    }

    @Override
    public void query() {
        System.out.println("查看了一个用户");
    }

    //1.不能随意改动原有的业务代码 在公司中
}
