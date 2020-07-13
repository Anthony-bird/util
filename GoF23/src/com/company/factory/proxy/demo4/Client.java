package com.company.factory.proxy.demo4;

import com.company.factory.proxy.demo2.UserService;
import com.company.factory.proxy.demo2.UserServiceImpl;

public class Client {
    public static void main(String[] args) {
        //真实角色
        UserServiceImpl userService = new UserServiceImpl();
        //代理角色 不存在
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        //设置代理的对象
        pih.setTarget(userService);
        //动态生成代理类
        UserService proxy =(UserService) pih.getProxy();
        proxy.add();

    }
}
//ProxyInvocationHandler 调用程序处理的接口
// Proxy提供创建动态代理和实例的静态方法
