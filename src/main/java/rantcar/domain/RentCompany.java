package rantcar.domain;

import java.util.ArrayList;
import java.util.List;

public class RentCompany {

	private List<Car> cars = new ArrayList<>();

	public static RentCompany create() {
		return new RentCompany();
	}

	public void addCar(Car car) {
		this.cars.add(car);
	}

	public String generateReport() {
		StringBuilder builder = new StringBuilder();
		for (Car car : this.cars) {
			builder.append(car.getName())
				.append(" : ")
				.append((int) car.calculatorFuel())
				.append("리터")
				.append("\n");
		}

		return builder.toString();
	}
}
