package miu.asd.lab9.b;

public class GearZero implements Gear {
  private final int defaultSpeed = 0;
  private Car car;
  private final int max = 0;
  public GearZero(Car car){
    this.car = car;
  };

  @Override
  public Integer getSpeed(Integer speed) {
    int result = defaultSpeed;
    if(speed > max) {
      result = car.changeGear(car.gear1).getSpeed(speed);
    }
    return result;
  }
}
