package hw1cosc4353;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SemiPerimTest {

	@Test
	void test() {
		Triangle Tri = new Triangle(3,4,5);
		double result = Tri.semiperim();
		assertEquals(6,result);
	}

}
