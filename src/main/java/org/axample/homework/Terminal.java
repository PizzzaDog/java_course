package org.axample.homework;

public interface Terminal {

    void deposit(int bankNumber, double sum);

    void deposit(double sum);

    void topUpPhone(int phoneNumber, double sum);

    Double getBalance();

    void setBankNumber(int bankNumber);
}
