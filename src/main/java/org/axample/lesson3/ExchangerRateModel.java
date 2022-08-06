package org.axample.lesson3;

public class ExchangerRateModel {
    private Currency currencyFrom;
    private Currency currencyTo;
    private Double amount;

    public ExchangerRateModel(Currency currencyFrom, Currency currencyTo, Double amount) {
        this.currencyFrom = currencyFrom;
        this.currencyTo = currencyTo;
        this.amount = amount;
    }

    public ExchangerRateModel() {
    }

    public Currency getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(Currency currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public Currency getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(Currency currencyTo) {
        this.currencyTo = currencyTo;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Currency To : " + this.currencyTo +
                "Currency From : " + this.currencyFrom +
                "Amount : " + this.amount;
    }
}
