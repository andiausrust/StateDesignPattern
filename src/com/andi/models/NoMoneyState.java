package com.andi.models;

public class NoMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public NoMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("you inserted a dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getHasMoneyState());
    }

    @Override
    public void ejectMoney() {
        System.out.println("you haven't inserted a dollar");
    }

    @Override
    public void select() {
        System.out.println("you selected but there is no money");
    }

    @Override
    public void dispense() {
        System.out.println("you need to pay me first");
    }

    @Override
    public String toString() {
        return "waiting for a dollar";
    }
}
