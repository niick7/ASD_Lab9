package miu.asd.lab9.b;

public class GearFifth implements Gear {
  private final int defaultSpeed = 5;
  private Car car;
  private final int min = 55;
  public GearFifth(Car car){
    this.car = car;
  };

  @Override
  public Integer getSpeed(Integer speed) {
    int result = defaultSpeed;
    if (speed < min) {
      result = car.changeGear(car.gear0).getSpeed(speed);
    }
    return result;
  }
}
