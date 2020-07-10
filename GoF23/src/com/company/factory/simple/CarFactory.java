package com.company.factory.simple;

//静态代理模式
//增加一个新的产品,如果你不修改代码，做不到

//开闭原则
public class CarFactory {

    public static Car getCar(String car){
        if (car.equals("五菱")){
            return new WuLing();
        }else if (car.equals("特斯拉")){
            return new Tesla();
        }else {
            return null;
        }
    }
    //方法二
    public static Car getWuLing() {
        return new WuLing();
    }
    public static Car getTesla() {
        return new Tesla();
    }
}
