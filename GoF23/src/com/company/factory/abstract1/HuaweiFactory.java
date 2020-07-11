package com.company.factory.abstract1;

public class HuaweiFactory implements IProductFactory {

    @Override
    public IphoneProduct iphoneProduct() {
        return new HuaweiPhone();
    }

    @Override
    public IRouterProduct routerproduct() {
        return new HuaweiRouter();
    }
}
