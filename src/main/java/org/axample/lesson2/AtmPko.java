package org.axample.lesson2;

public class AtmPko implements Atm {

    public void getCash(Currency currency, Integer amount) {
        System.out.println("Денег нет, приходите потом");
    }
}
