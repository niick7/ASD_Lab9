package miu.asd.lab9.a;

public class NoQuarterState implements State {
	public NoQuarterState(){};
 
	public State insertQuarter() {
		System.out.println("You inserted a quarter");
		return new HasQuarterState();
	}
 
	public State ejectQuarter() throws IllegalAccessException {
		throw new IllegalAccessException("You haven't inserted a quarter");
	}
 
	public State turnCrank() throws IllegalAccessException {
		throw new IllegalAccessException("You turned, but there's no quarter");
	 }
 
	public State dispense() throws IllegalAccessException {
		throw new IllegalAccessException("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for quarter";
	}
}
