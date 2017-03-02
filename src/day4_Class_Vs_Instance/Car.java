package day4_Class_Vs_Instance;

public class Car {

	// Defining Properties
	int maxSpeed = 100;
	int minSpeed = 0;
	double weight = 4079.0;
	boolean isTheCarOn = false;
	char condition = 'A';
	
	public Car() {
		maxSpeed = 100;
		minSpeed = 0;
		weight = 4079.0;
		isTheCarOn = false;
		condition = 'A';
	}

	public Car(int customMaxSpeed, int customMinSpeed, double customWeight, boolean customIsTheCarOn, char customCondition) {
		maxSpeed = customMaxSpeed;
		minSpeed = customMinSpeed;
		weight = customWeight;
		isTheCarOn = customIsTheCarOn;
		condition = customCondition;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getMinSpeed() {
		return minSpeed;
	}

	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public boolean isTheCarOn() {
		return isTheCarOn;
	}

	public void setTheCarOn(boolean isTheCarOn) {
		this.isTheCarOn = isTheCarOn;
	}

	public char getCondition() {
		return condition;
	}

	public void setCondition(char condition) {
		this.condition = condition;
	}

	public void printVariables() {
		System.out.println(maxSpeed);
		System.out.println(minSpeed);
		System.out.println(weight);
		System.out.println(isTheCarOn);
		System.out.println(condition);
	}

}
