package rantcar.domain;

public abstract class Car {
	abstract String getName();
	abstract double getDistancePerLiter();
	abstract double getTripDistance();

	protected double calculatorFuel() {
		return getTripDistance() / getDistancePerLiter();
	}
}
