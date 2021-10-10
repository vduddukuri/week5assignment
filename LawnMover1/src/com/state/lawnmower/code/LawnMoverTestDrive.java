package com.state.lawnmower.code;

public class LawnMoverTestDrive {

	public static void main(String[] args) {
		
		LawnMowerMachine lawnmowerMachine = new LawnMowerMachine(10);

		System.out.println(lawnmowerMachine);

		lawnmowerMachine.insertWorking();
		lawnmowerMachine.turnGrass();
		

	}

}

