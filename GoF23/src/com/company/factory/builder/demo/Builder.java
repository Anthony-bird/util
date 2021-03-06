package com.company.factory.builder.demo;

//抽象的建造者：方法
public abstract class Builder {
    abstract void builderA();//地基
    abstract void builderB();//钢筋工程
    abstract void builderC();//铺电线
    abstract void builderD();//粉刷

    //完工 得到产品
    abstract Product getProduct();
}
