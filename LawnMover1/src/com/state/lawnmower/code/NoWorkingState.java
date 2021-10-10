package com.state.lawnmower.code;


public class NoWorkingState implements State {
	LawnMowerMachine lawnmowerMachine;
 
    public NoWorkingState(LawnMowerMachine lawnmowerMachine) {
        this.lawnmowerMachine = lawnmowerMachine;
    }
 
	public void insertWorking() {
		System.out.println("You inserted a worker");
		lawnmowerMachine.setState(lawnmowerMachine.getHasWorkingState());
	}
 
	public void ejectWorking() {
		System.out.println("You haven't inserted a worker");
	}
 
	public void turnGrass() {
		System.out.println("You turned, but there's no worker");
	 }
 
	public void rented() {
		System.out.println("You need to pay first");
	} 
	
	public void restock() { }
 
	public String toString() {
		return "waiting for worker";
	}

}
