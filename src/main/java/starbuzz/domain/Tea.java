package starbuzz.domain;

public class Tea extends Beverage{

	@Override
	public void brew() {
		System.out.println("차 티백을 담근다.");
	}

	@Override
	public void addCondiments() {
		System.out.println("레몬을 추가한다.");
	}
}
