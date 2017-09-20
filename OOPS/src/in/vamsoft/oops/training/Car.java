package in.vamsoft.oops.training;

/**
 * @author vamsoft This is a abstract class
 */
public abstract class Car extends Vehicle {

  public Car() {
	System.out.println("Car.Car()");
  }

  @Override
  public void start() {
	System.out.println("Starting....");

  }

}
