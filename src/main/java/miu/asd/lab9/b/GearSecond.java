package miu.asd.lab9.b;

public class GearSecond implements Gear {
  private final int defaultSpeed = 2;
  private Car car;
  private final int min = 5;
  private final int max = 9;
  public GearSecond(Car car){
    this.car = car;
  };

  @Override
  public Integer getSpeed(Integer speed) {
    int result = defaultSpeed;
    if(speed > max) {
      result = car.changeGear(car.gear3).getSpeed(speed);
    } else if (speed < min) {
      result = car.changeGear(car.gear1).getSpeed(speed);
    }
    return result;
  }
}
