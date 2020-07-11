package com.company.factory.proxy.demo2;

public class UserServiceProxy implements UserService {

    private UserServiceImpl userService;

    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        System.out.println("增加了一个用户");
    }

    @Override
    public void delete() {
        log("delete");
        System.out.println("删除了一个用户");
    }

    @Override
    public void update() {
        log("update");
        System.out.println("更改了一个用户");
    }

    @Override
    public void query() {
        log("query");
        System.out.println("查看了一个用户");
    }

    //日志方法
    public void log(String msg) {
        System.out.println("[Debug] 使用了" + msg + "方法");
    }
}
