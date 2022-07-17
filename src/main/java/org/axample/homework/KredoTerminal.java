package org.axample.homework;

import java.util.HashMap;
import java.util.Objects;

public class KredoTerminal implements Terminal{

    private HashMap<Integer,Double> usersDB = new HashMap<>() {{
       put(111222333,10000.0);
       put(444555666,7000.0);
       put(777888999,15000.0);
    }};
    private HashMap<Integer,Double> phonesDB = new HashMap<>() {{
       put(111222333, 170.0);
       put(660167192, 28.66);
       put(444555666, 100.0);
    }};

    private Integer bankNumber;    // To store bank card number
    private Double balance;    // To store user balance
    private boolean limitedAccess;    // If terminal hasn't enough information about user limitedAccess= true
    private Double commission = 0.01;


    // If user want to use a terminal but without inserting his bank card
    public KredoTerminal(){
        limitedAccess = true;
    }
    // If user insert his bank card:
    public KredoTerminal(int newBankNumber){
        if(usersDB.containsKey(newBankNumber))
        {
            this.bankNumber = newBankNumber;
            this.balance = usersDB.get(newBankNumber);
            this.limitedAccess = false;
        }
        else {
            System.out.println("We don't find such bank number");
            this.limitedAccess = true;
        }
    }
    // To let user insert his bank card:
    public void setBankNumber(int newBankNumber) {
        if(usersDB.containsKey(newBankNumber))
        {
            this.bankNumber = newBankNumber;
            this.balance = usersDB.get(newBankNumber);
            this.limitedAccess = false;
        }
        else {
            System.out.println("We don't find such bank number");
            this.limitedAccess = true;
        }
    }
    // To deposit on the specified card
    public void deposit(int bankNumber, double sum){
        if (limitedAccess){
            System.out.println("\nPlease insert your card\n");
        }
        else {
            if (this.balance >= sum){
                if(usersDB.containsKey(bankNumber)){    // If current bank have such bank number
                    balance -= sum;

                    double alienBalance = usersDB.get(bankNumber);
                    alienBalance += sum;
                    usersDB.replace(bankNumber,alienBalance);
                    System.out.println("Operation successful\nSincerely yours KredoBank");
                }
                else {    // if current bank haven`t such bank account
                    double requiredSum = sum + sum* commission;
                    balance -= requiredSum;

                    /*
                        Sending resources to another bank process
                    */

                    System.out.println("Operation successful\nSincerely yours KredoBank");
                }
            }
            else {
                System.out.println("You don't have enough money");
            }
        }
    }
    // To deposit on the current bank number
    public void deposit(double sum){
        if(limitedAccess){
            System.out.println("\nPlease insert your card\n");
        } else {
            this.balance += sum;
            usersDB.replace(bankNumber,balance);
            System.out.println("\nThe deposit has been successfully made.\nSincerely yours KredoBank");
        }
    }
    // To top up specified phone number
    public void topUpPhone(int phoneNumber, double sum){
        if (phonesDB.containsKey(phoneNumber)){
            double phoneBalance = phonesDB.get(phoneNumber);
            phoneBalance += sum;
            phonesDB.replace(phoneNumber,phoneBalance);
        }
        else {
            System.out.println("Such phone number isn't supported");
        }
    }
    // To get balance of inserted card
    public Double getBalance(){
        if(!limitedAccess){
            return balance;
        }
        return 0.0;
    }
    public void setCommission(Integer inputAdminPassword, Double newCommission){
        final Integer adminPassword = 1111;
        if (Objects.equals(inputAdminPassword, adminPassword)){
            this.commission = newCommission;
        }
        else {
            System.out.println("Denied access");
        }
    }

}
