package com.state.lawnmower.code;


public class StartState implements State {
	LawnMowerMachine lawnmowerMachine;
 
    public StartState(LawnMowerMachine lawnmowerMachine) {
        this.lawnmowerMachine = lawnmowerMachine;
    }
 
	public void insertWorking() {
		System.out.println("You can't insert a worker, the machine is start");
	}
 
	public void ejectWorking() {
		System.out.println("You can't eject, you haven't inserted a worker yet");
	}
 
	public void turnGrass() {
		System.out.println("You turned, but there are no lawnmowers");
	}
 
	public void rented() {
		System.out.println("No lawnmower rented");
	}
		
	public void restock() { 
		lawnmowerMachine.setState(lawnmowerMachine.getNoWorkingState());
	}
 
	public String toString() {
		return "start";
	}
}
