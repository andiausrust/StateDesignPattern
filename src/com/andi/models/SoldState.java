package com.andi.models;

public class SoldState implements State {

    SodaVendingMachine sodaVendingMachine;

    public SoldState(SodaVendingMachine sodaVendingMachine) {
        this.sodaVendingMachine = sodaVendingMachine;
    }

    @Override
    public void insertMoney() {
        System.out.println("give a second ... soda coming right up");
    }

    @Override
    public void ejectMoney() {
        System.out.println("sorry... soda is coming");
    }

    @Override
    public void select() {
        System.out.println("nope.. you cant't eject the money");
    }

    @Override
    public void dispense() {
        System.out.println("stop trying to get soda for free ...");
        if(sodaVendingMachine.getCount()>0){
            sodaVendingMachine.setState(sodaVendingMachine.noMoneyState);
        } else {
            System.out.println("sorry out of sodas");
            sodaVendingMachine.setState(sodaVendingMachine.noMoneyState);
        }
    }

    @Override
    public String toString() {
        return "Dispensing soda";
    }
}
