package com.company.factory.abstract1;

public class XiaomiRouter implements IRouterProduct {
    @Override
    public void start() {
        System.out.println("启动小米路由器");
    }

    @Override
    public void shutdown() {
        System.out.println("关闭小米路由器");
    }

    @Override
    public void openWife() {
        System.out.println("打开小米WIFi");
    }

    @Override
    public void setting() {
        System.out.println("小米设置");
    }
}
