package com.andi;

import com.andi.models.SodaVendingMachine;

public class Main {

    public static void main(String[] args) {

        SodaVendingMachine sodaVendingMachine = new SodaVendingMachine(10);
        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();
        System.out.println("------------");

        System.out.println(sodaVendingMachine);

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        System.out.println("------------");

        sodaVendingMachine.insertMoney();
        sodaVendingMachine.selectSoda();

        System.out.println(sodaVendingMachine);
    }
}
