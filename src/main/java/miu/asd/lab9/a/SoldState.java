package miu.asd.lab9.a;

public class SoldState implements State {
	public SoldState(){};
       
	public State insertQuarter() throws IllegalAccessException {
		throw new IllegalAccessException("Please wait, we're already giving you a gumball");
	}
 
	public State ejectQuarter() throws IllegalAccessException {
		throw new IllegalAccessException("Sorry, you already turned the crank");
	}
 
	public State turnCrank() throws IllegalAccessException {
		throw new IllegalAccessException("Turning twice doesn't get you another gumball!");
	}
 
	public State dispense() {
		return new NoQuarterState();
//		gumballMachine.releaseBall();
//		if (gumballMachine.getCount() > 0) {
//			gumballMachine.setState(gumballMachine.getNoQuarterState());
//		} else {
//			System.out.println("Oops, out of gumballs!");
//			gumballMachine.setState(gumballMachine.getSoldOutState());
//		}
	}
 
	public String toString() {
		return "dispensing a gumball";
	}
}


