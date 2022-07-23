package org.axample.lesson3;

import java.util.HashMap;

public class ExchangerImpl implements Exchanger {

    private HashMap<Currency, Double> cash;

    private ExchangerRepository exchangerRepository;


    @Override
    public void exchange(Currency from, Currency to, Double amount) {
        //TODO write some logic
    }

    public ExchangerImpl() {
    }

    public ExchangerImpl(HashMap<Currency, Double> cash) {
        this.cash = cash;
    }
}
