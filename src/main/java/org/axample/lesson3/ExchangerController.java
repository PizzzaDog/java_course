package org.axample.lesson3;

import org.axample.lesson3.commands.*;

import java.io.IOException;

public class ExchangerController {

    private ExchangerImpl exchanger = new ExchangerImpl();

    public ExchangerController() throws IOException {
    }

    public void UI(Command command) {
        command.execute();
    }

    public void cashExchange(Currency currencyFrom,Currency currencyTo, Double cashAmount) throws IOException {
        Double result = exchanger.exchange(currencyFrom,currencyTo,cashAmount);
        if (result != null) {
            this.UI(new SuccessCommand());
        } else {
            this.UI(new ErrorCommand());
        }
    }
}
