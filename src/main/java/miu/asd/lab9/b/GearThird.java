package miu.asd.lab9.b;

public class GearThird implements Gear {
  private final int defaultSpeed = 3;
  private Car car;
  private final int min = 10;
  private final int max = 29;
  public GearThird(Car car){
    this.car = car;
  };

  @Override
  public Integer getSpeed(Integer speed) {
    int result = defaultSpeed;
    if(speed > max) {
      result = car.changeGear(car.gear4).getSpeed(speed);
    } else if (speed < min) {
      result = car.changeGear(car.gear2).getSpeed(speed);
    }
    return result;
  }
}
