package com.company.factory.abstract1;

public class Client {
    public static void main(String[] args) {
        System.out.println("======小米系列产品======");
        //小米工厂
        XiaomiFactory xiaomiFactory = new XiaomiFactory();
        IphoneProduct iphoneProduct = xiaomiFactory.iphoneProduct();
        iphoneProduct.callup();
        iphoneProduct.sendSMS();

        IRouterProduct iRouterProduct = xiaomiFactory.routerproduct();
        iRouterProduct.openWife();

        System.out.println("======华为系列产品======");
        //华为工厂
        HuaweiFactory huaweiFactory = new HuaweiFactory();
        IphoneProduct iphoneProduct2 = huaweiFactory.iphoneProduct();
        iphoneProduct2.callup();
        iphoneProduct2.sendSMS();

        IRouterProduct iRouterProduct2 = huaweiFactory.routerproduct();
        iRouterProduct2.openWife();
    }
}
