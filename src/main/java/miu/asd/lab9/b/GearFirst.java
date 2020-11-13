package miu.asd.lab9.b;

public class GearFirst implements Gear {
  private final int defaultSpeed = 1;
  private Car car;
  private final int min = 1;
  private final int max = 4;
  public GearFirst(Car car){
    this.car = car;
  };

  @Override
  public Integer getSpeed(Integer speed) {
    int result = defaultSpeed;
    if(speed > max) {
      result = car.changeGear(car.gear2).getSpeed(speed);
    } else if (speed < min) {
      result = car.changeGear(car.gear0).getSpeed(speed);
    }
    return result;
  }
}
