package com.andi.models;

public class SoldOutState implements State {

    SodaVendingMachine sodaVendingMachine;

    public SoldOutState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("machine sold out");
    }

    @Override
    public void ejectMoney() {
        System.out.println("insert money first before ejecting");
    }

    @Override
    public void select() {
        System.out.println("no soda available");
    }

    @Override
    public void dispense() {
        System.out.println("sold out");
    }

    @Override
    public String toString() {
        return "sold out ...";
    }
}
