package com.state.lawnmower.code;


import java.util.Random;

public class HasWorkingState implements State {
	Random randomWinner = new Random(System.currentTimeMillis());
	LawnMowerMachine lawnmowerMachine;
 
	public HasWorkingState(LawnMowerMachine lawnmowerMachine) {
		this.lawnmowerMachine = lawnmowerMachine;
	}
  
	public void insertWorking() {
		System.out.println("You can't insert another worker");
	}
 
	public void ejectWorking() {
		lawnmowerMachine.releaseMower();
		lawnmowerMachine.setState(lawnmowerMachine.getNoWorkingState());
	}
 
	public void turnGrass() {
		System.out.println("lawn mower starts working ");
		if (lawnmowerMachine.getCount() > 1) {
			lawnmowerMachine.setState(lawnmowerMachine.getWinnerState());
		} else {
			lawnmowerMachine.setState(lawnmowerMachine.getStopState());
		}
	}

    public void rented() {
        System.out.println("No lawnmower rented");
    }
    
    public void restock() {
    	System.out.println("retocked with workers");
    	
    }
 
	public String toString() {
		return "waiting for turn of grass";
	}
}
