package rantcar.domain;

public class Avante extends Car {

	private final static String NAME = "Avante";
	private final static int DISTANCE_PER_LITER = 15;
	private final int distance;
	public Avante(int distance) {
		this.distance = distance;
	}

	@Override
	public double getDistancePerLiter() {
		return DISTANCE_PER_LITER;
	}

	@Override
	public double getTripDistance() {
		return this.distance;
	}

	@Override
	public String getName() {
		return NAME;
	}
}
