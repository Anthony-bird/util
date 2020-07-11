package com.company.factory.builder.demo;

//指挥: 核心。负责指挥构建一个工程，工厂如何构建，由他决定
public class Director {

    //指挥工人按照顺序建房子
    public Product build(Builder builder) {
        builder.builderA();

        builder.builderC();
        builder.builderD();
        builder.builderB();

        return builder.getProduct();
    }
}
