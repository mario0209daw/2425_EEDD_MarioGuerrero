package com.softmar.MoneyConvert;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class Main {
    public static void main(String[] args) {
        // Definir cantidades en diferentes monedas
        Money usdAmount = Money.of(CurrencyUnit.USD, 100);
        CurrencyUnit eur = CurrencyUnit.EUR;
        Money usdAmount1 = Money.of(CurrencyUnit.USD, 200);
        CurrencyConverter c;

        // Tipo de cambio ficticio (1 USD = 0.85 EUR)
        double exchangeRate = 0.85;

        // Realizar conversión
        Money eurAmount = CurrencyConverter.convert(usdAmount, eur, exchangeRate);

        // Mostrar resultado
        System.out.println(usdAmount + " equivale a " + eurAmount);

        System.out.println(CurrencyConverter.addMoney(usdAmount1,usdAmount));
        System.out.println(CurrencyConverter.subtractMoney(usdAmount,usdAmount1));
        CurrencyConverter.compareAmounts(usdAmount1,usdAmount);
    }
}
