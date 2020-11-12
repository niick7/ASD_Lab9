package miu.asd.lab9.a;

public class SoldOutState implements State {
	public SoldOutState(){};
 
	public State insertQuarter() throws IllegalAccessException {
		throw new IllegalAccessException("You can't insert a quarter, the machine is sold out");
	}
 
	public State ejectQuarter() throws IllegalAccessException {
		throw new IllegalAccessException("You can't eject, you haven't inserted a quarter yet");
	}
 
	public State turnCrank() throws IllegalAccessException {
		throw new IllegalAccessException("You turned, but there are no gumballs");
	}
 
	public State dispense() throws IllegalAccessException {
		throw new IllegalAccessException("No gumball dispensed");
	}
 
	public String toString() {
		return "sold out";
	}
}
