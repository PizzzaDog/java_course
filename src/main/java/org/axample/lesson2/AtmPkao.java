package org.axample.lesson2;

import java.util.List;
import java.util.Map;

public class AtmPkao implements Atm {
    Map<Currency, Integer> cash;
    List<String> currencies;

    public void getCash(Currency currency, Integer amount) {
        System.out.println("Получите свои " + amount + " " + currency.toString());
    }

    public void getStrangeCash(String currency, Integer amount) {
        System.out.println("Получите свои money " + amount + " " + currency);
    }
}
