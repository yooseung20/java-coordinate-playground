package rantcar.domain;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class CarTest {
	@Test
	void 소나타_연비() {
		Car sonata = new Sonata(100);
		assertThat(sonata.getDistancePerLiter()).isEqualTo(10);
	}

	@Test
	void 소나타_이름() {
		Car sonata = new Sonata(100);
		assertThat(sonata.getName()).isEqualTo("Sonata");
	}

	@Test
	void 소나타_주입해야할_원료량() {
		Car sonata = new Sonata(150);
		assertThat(sonata.calculatorFuel()).isEqualTo(15);
	}

	@Test
	void 아반떼_연비() {
		Car avante = new Avante(100);
		assertThat(avante.getDistancePerLiter()).isEqualTo(15);
	}

	@Test
	void 아반떼_이름() {
		Car avante = new Avante(100);
		assertThat(avante.getName()).isEqualTo("Avante");
	}

	@Test
	void 아반떼_주입해야할_원료량() {
		Car avante = new Avante(300);
		assertThat(avante.calculatorFuel()).isEqualTo(20);
	}

	@Test
	void k5_연비() {
		Car k5 = new K5(100);
		assertThat(k5.getDistancePerLiter()).isEqualTo(13);
	}

	@Test
	void k5_이름() {
		Car k5 = new K5(100);
		assertThat(k5.getName()).isEqualTo("K5");
	}

	@Test
	void k5_주입해야할_원료량() {
		Car k5 = new K5(130);
		assertThat(k5.calculatorFuel()).isEqualTo(10);
	}
}
