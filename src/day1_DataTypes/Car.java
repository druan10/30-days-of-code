package day1_DataTypes;

public class Car {

	// Defining Properties
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079.0;
	boolean isTheCarOn = false;
	char condition = 'A';

	public void printVariables() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
	}

	public void wreckCar() { // Changes value for this instance, a shared copy
		condition = 'C';
	}

	public static void main(String[] args) {
		Car familyCar = new Car();
		familyCar.printVariables();
		familyCar.wreckCar();
		System.out.println("Wrecked!");
		familyCar.printVariables();
	}

}
