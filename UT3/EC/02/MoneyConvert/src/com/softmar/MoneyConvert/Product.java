package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Product {
    public String name;
    public Money price;

    public Product(String name, Money price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Money getPrice() {
        return price;
    }

    public void setPrice(Money price) {
        this.price = price;
    }

    public Money applyDiscount(Money price, double porcentage) {
        double discountAmount = price.getAmount().doubleValue() * (porcentage / 100);
        return price.minus(discountAmount);
    }

}
