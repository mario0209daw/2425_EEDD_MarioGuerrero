package com.softmar.MoneyConvert;

import org.joda.money.Money;

public class Product {
    String name;
    Money price;

    public Money applyDiscount(Money price, double percentage){
        return price;
    }

}
