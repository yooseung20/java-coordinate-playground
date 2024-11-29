package rantcar.domain;

public class K5 extends Car {
	private final static String NAME = "K5";
	private final static int DISTANCE_PER_LITER = 13;
	private final int distance;

	public K5(int distance) {
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
