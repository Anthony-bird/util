package com.company.factory.abstract1;

public class XiaomiFactory implements IProductFactory {
    @Override
    public IphoneProduct iphoneProduct() {
        return new XiaomiPhone();
    }

    @Override
    public IRouterProduct routerproduct() {
        return new XiaomiRouter();
    }
}
