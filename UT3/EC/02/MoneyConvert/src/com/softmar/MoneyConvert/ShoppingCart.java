package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import java.util.List;

public class ShoppingCart {

    public static Money usdAmount = Money.of(CurrencyUnit.USD, 1200);
    public static Product laptop= new Product("laptop",usdAmount);
    public static Product smartphone= new Product("gel",usdAmount.minus(400));
    public static Product auriculares = new Product("gel",usdAmount.minus(1050));

    public static void main(String[] args) {
        System.out.println("el precio del laptop sin descuento es :"+laptop.price);
        System.out.println("el precio del laptop con descuento es :"+laptop.applyDiscount(laptop.price,10));
        System.out.println("el precio del smartphone sin descuento es :"+smartphone.price);
        System.out.println("el precio del smatphone con descuento es :"+smartphone.applyDiscount(smartphone.price,20));
        System.out.println("el precio de los auriculares sin descuento es :"+auriculares.price);
    }







}
