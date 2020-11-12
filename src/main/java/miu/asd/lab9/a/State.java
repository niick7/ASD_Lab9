package miu.asd.lab9.a;

public interface State {
	public State insertQuarter() throws IllegalAccessException;
	public State ejectQuarter() throws IllegalAccessException;
	public State turnCrank() throws IllegalAccessException;
	public State dispense() throws IllegalAccessException;
}
