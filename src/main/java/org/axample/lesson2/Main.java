package org.axample.lesson2;

public class Main {
    public static void main(String[] args) {
        Atm atm = new AtmPkao();
        atm.getCash(Currency.USD, 100);

        AtmPkao atmImpl = new AtmPkao();
        atmImpl.getStrangeCash("UAH", 100);

        atm = new AtmPko();
        atm.getCash(Currency.USD, 100);


    }
}
