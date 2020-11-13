package miu.asd.lab9.b;

public class Car {
  Gear gear0;
  Gear gear1;
  Gear gear2;
  Gear gear3;
  Gear gear4;
  Gear gear5;
  int currentSpeed = 0;
  Gear currentGear;
  public Car() {
    gear0 = new GearZero(this);
    gear1 = new GearFirst(this);
    gear2 = new GearSecond(this);
    gear3 = new GearThird(this);
    gear4 = new GearFourth(this);
    gear5 = new GearFifth(this);
    this.currentGear = gear0;
  }

  public Gear changeGear(Gear gear) {
    currentGear = gear;
    return currentGear;
  }

  public int changeSpeed(int speed){
    currentSpeed = currentGear.getSpeed(speed);
    return currentSpeed;
  }
}