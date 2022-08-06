package org.axample.lesson3;

public class ExchangerCashModel {
    private Currency cashCurrency;
    private Double cashAmount;

    public ExchangerCashModel(){

    }

    public ExchangerCashModel(Currency newCurrency,Double newAmount) {
        this.cashCurrency = newCurrency;
        this.cashAmount = newAmount;
    }

    public Currency getCashCurrency() {
        return cashCurrency;
    }

    public Double getCashAmount() {
        return cashAmount;
    }

    public void setCashCurrency(Currency cashCurrency) {
        this.cashCurrency = cashCurrency;
    }

    public void setCashAmount(Double cashAmount) {
        this.cashAmount = cashAmount;
    }

    @Override
    public String toString() {
        return "Currency : " + this.cashCurrency + " Amount : " + this.cashAmount;
    }
}
