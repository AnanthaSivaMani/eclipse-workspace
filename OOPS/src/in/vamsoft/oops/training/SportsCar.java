package in.vamsoft.oops.training;

public class SportsCar extends Car {
	
	
	public SportsCar() {
		System.out.println("SportsCar.SportsCar()");
	}

	@Override
	public void start() {
		System.out.println("Sports Car Starting....");

	}

	@Override
	public void stop() {
		System.out.println("Sports Car Stopped....");

	}

	@Override
	public void brake() {
		System.out.println("SportsCar.brake()");

	}

}
