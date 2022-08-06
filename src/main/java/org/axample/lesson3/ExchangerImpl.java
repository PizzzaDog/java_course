package org.axample.lesson3;

import java.io.IOException;
import java.util.HashMap;

public class ExchangerImpl implements Exchanger {

    private HashMap<Currency, Double> cash;

    private ExchangerRepository exchangerRepository = new ExchangerRepository();

    public ExchangerImpl() throws IOException {
        this.cash = exchangerRepository.getCash();
    }

    @Override
    public Double exchange(Currency from, Currency to, Double amount) throws IOException {
        Double result = exchangerRepository.getRateByCurrency(from, to) * amount;

        if ((exchangerRepository.getCashByCurrency(to) != null) &&
                (exchangerRepository.getCashByCurrency(to) >= result) &&
                (result != null)) {
            Double oldCashFromStatus = cash.get(from);
            Double oldCashToStatus = cash.get(to);

            cash.put(from,oldCashFromStatus + amount);
            cash.put(to,oldCashToStatus - result);

            exchangerRepository.updateCash(cash);

            return result;
        }
        return null;
    }


}
