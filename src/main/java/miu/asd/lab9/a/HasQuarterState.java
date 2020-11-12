package miu.asd.lab9.a;

public class HasQuarterState implements State {
	public HasQuarterState(){};
  
	public State insertQuarter() throws IllegalAccessException {
		throw new IllegalAccessException("You can't insert another quarter");
	}
 
	public State ejectQuarter() {
		System.out.println("Quarter returned");
		return new NoQuarterState();
	}
 
	public State turnCrank() {
		System.out.println("You turned...");
		return new SoldState();
	}

	public State dispense() throws IllegalAccessException {
		throw new IllegalAccessException("No gumball dispensed");
	}
 
	public String toString() {
		return "waiting for turn of crank";
	}
}
