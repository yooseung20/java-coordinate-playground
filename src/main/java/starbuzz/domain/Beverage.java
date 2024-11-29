package starbuzz.domain;

public abstract class Beverage {
	abstract void brew();

	abstract void addCondiments();

	protected void make() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	protected void boilWater() {
		System.out.println("물을 끓인다.");
	}

	protected void pourInCup() {
		System.out.println("컵에 붓는다.");
	}
}
