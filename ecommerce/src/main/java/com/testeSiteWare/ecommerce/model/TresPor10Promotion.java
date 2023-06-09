package com.testeSiteWare.ecommerce.model;

public class TresPor10Promotion extends Promotions {
    public double calculatePrice(int quantity, double unitPrice) {
        int setsOfThree = quantity / 3;
        int remainder = quantity % 3;
        double totalPrice = setsOfThree * 10.0;
        totalPrice += remainder * unitPrice;
        return totalPrice;
    }
}
