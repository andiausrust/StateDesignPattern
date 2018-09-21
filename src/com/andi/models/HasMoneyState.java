package com.andi.models;

public class HasMoneyState implements State {

    SodaVendingMachine sodaVendingMachine;

    public HasMoneyState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("no need to insert another dollar");

    }

    @Override
    public void ejectMoney() {
        System.out.println("returning a your dollar");
        sodaVendingMachine.setState(sodaVendingMachine.getNoMoneyState());
    }

    @Override
    public void select() {
        System.out.println("selected item ....");
        sodaVendingMachine.setState(sodaVendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("no soda dispensed");
    }

    @Override
    public String toString() {
        return "waiting for a new selection";
    }
}
