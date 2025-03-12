package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class CurrencyConverter {
    public static Money convert(Money amount, CurrencyUnit targetCurrency, double rate) {
        double convertedAmount = amount.getAmount().doubleValue() * rate;
        return Money.of(targetCurrency, convertedAmount);
    }
    public static Money addMoney(Money m1, Money m2){
        Money suma;

        suma = m1.plus(m2);

        return suma;
    }
    public static Money subtractMoney(Money m1, Money m2){
        Money resta = m1.minus(m2);
        return resta;

    }
    public static void compareAmounts(Money m1, Money m2){
        if (m1.isLessThan(m2)){
            System.out.println(m1 + " es menor que "+ m2);
        }
        else if (m1.isEqual(m2)){
            System.out.println(m1 +" es igual que "+m2);

        }
        else System.out.println(m1 +" es mayor que "+m2);
    }
}
