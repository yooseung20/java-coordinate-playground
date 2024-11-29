package rantcar.domain;


public class Sonata extends Car {
	private static final double DISTANCE_PER_LITER = 10;
	private static final String NAME = "Sonata";

	private final int distance;

	public Sonata(int distance) {
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
