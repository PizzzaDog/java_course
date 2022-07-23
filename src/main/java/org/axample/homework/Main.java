package org.axample.homework;

public class Main {
    public static void main(String[] args) {
        // Creating KredoTerminal obj with existing bank number
        KredoTerminal klovskaStreet = new KredoTerminal(777888999);
        // Creating KredoTerminal obj with non-existent bank number of KredoBank
        KredoTerminal heroivDnipraStreet = new KredoTerminal(123456789);
        // Testing constructor without arguments
        KredoTerminal smyczkowaStreet = new KredoTerminal();

        //
        klovskaStreet.deposit(222.22);
        klovskaStreet.deposit(111222333, 1200.20);

        System.out.printf("%.2f", klovskaStreet.getBalance());
        System.out.println();

        heroivDnipraStreet.setBankNumber(111222333);
        System.out.printf("%.2f", heroivDnipraStreet.getBalance());
        System.out.println();

        heroivDnipraStreet.topUpPhone(444555666, 77.70);
        heroivDnipraStreet.topUpPhone(123456789,1000);

        smyczkowaStreet.setCommission(0110,0.3);
        smyczkowaStreet.setCommission(1111,0.3);
    }
}
