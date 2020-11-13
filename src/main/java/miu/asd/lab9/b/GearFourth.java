package miu.asd.lab9.b;

public class GearFourth implements Gear {
  private final int defaultSpeed = 4;
  private Car car;
  private final int min = 30;
  private final int max = 54;
  public GearFourth(Car car){
    this.car = car;
  };

  @Override
  public Integer getSpeed(Integer speed) {
    int result = defaultSpeed;
    if(speed > max) {
      result = car.changeGear(car.gear5).getSpeed(speed);
    } else if (speed < min) {
      result = car.changeGear(car.gear3).getSpeed(speed);
    }
    return result;
  }
}
