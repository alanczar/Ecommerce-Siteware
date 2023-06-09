package com.testeSiteWare.ecommerce.model;

public class Leve2Pague1Promotion  extends Promotions{

    public double calculatePrice(int quantity, double unitPrice) {
        int paidItems = quantity - quantity / 2;
        return paidItems * unitPrice;
    }
}

