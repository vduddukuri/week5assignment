package com.state.lawnmower.code;


public class LawnMowerMachine {
 
	State startState;
	State noWorkingState;
	State hasWorkingState;
	State stopState;
	State winnerState;
 
	State state = startState;
	int count = 0;
 
	public LawnMowerMachine(int numberLawnMowers) {
		startState = new StartState(this);
		noWorkingState = new NoWorkingState(this);
		hasWorkingState = new HasWorkingState(this);
		stopState = new StopState(this);
		winnerState = new WinnerState(this);

		this.count = numberLawnMowers;
 		if (numberLawnMowers > 0) {
			state = noWorkingState;
		} 
	}
 
	public void insertWorking() {
		state.insertWorking();
	}
 
	public void ejectWorking() {
		state.ejectWorking();
	}
 
	public void turnGrass() {
		state.turnGrass();
		state.rented();
	}

	void setState(State state) {
		this.state = state;
	}
 
	void releaseMower() {
		System.out.println("A lawnmower completes working "+ "..");
		if (count > 0) {
			count = count - 1;
		}
	}
 
	int getCount() {
		return count;
	}
 
	void refill(int count) {
		this.count += count;
		System.out.println("The lawnmower machine was just restocked with power; its new count is: " + this.count);
		
	}

    public State getState() {
        return state;
    }

    public State getStartState() {
        return startState;
    }

    public State getNoWorkingState() {
        return noWorkingState;
    }

    public State getHasWorkingState() {
        return hasWorkingState;
    }

    public State getStopState() {
        return stopState;
    }

    public State getWinnerState() {
        return winnerState;
    }
 
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("\nDheeraj LawnMower working ");
		result.append("\nDheeraj given positions to different LawnMower Workers ");
		result.append("\nInventory: " + count + " lawnmower");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is " + state + "\n");
		return result.toString();
	}
}
