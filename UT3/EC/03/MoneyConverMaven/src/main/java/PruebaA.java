import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

public class PruebaA {
    public static void main(String[] args) {
        Money usd1 = Money.of(CurrencyUnit.USD, 100);
        Money usd2 = Money.of(CurrencyUnit.USD, 50);
        CurrencyUnit eur = CurrencyUnit.EUR;
        double exchangeRate = 0.85;

        double eurAmount = usd1.getAmount().doubleValue() * exchangeRate;

        System.out.println("100 USD equivale a " + eurAmount + " EUR.");

        System.out.println("suma :" + CurrencyConverter.addMoney(usd1, usd2));
        System.out.println("resta : " + CurrencyConverter.subtractMoney(usd1, usd2));
        CurrencyConverter.compareAmounts(usd1, usd2);

    }
}
