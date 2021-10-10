package com.state.lawnmower.code;


public class StopState implements State {
	LawnMowerMachine lawnmowerMachine;
 
    public StopState(LawnMowerMachine lawnmowerMachine) {
        this.lawnmowerMachine = lawnmowerMachine;
    }
       
	public void insertWorking() {
		System.out.println("Please wait");
	}
 
	public void ejectWorking() {
		System.out.println("Sorry, you already turned the grass");
	}
 
	public void turnGrass() {
		System.out.println("Turning twice doesn't get you another lawnmower!");
	}
 
	public void rented() {
		lawnmowerMachine.releaseMower();
		if (lawnmowerMachine.getCount() > 0) {
			lawnmowerMachine.setState(lawnmowerMachine.getNoWorkingState());
		} else {
			System.out.println("Power out of lawnmowers!");
			lawnmowerMachine.setState(lawnmowerMachine.getStopState());
		}
	}
	
	
 
	}