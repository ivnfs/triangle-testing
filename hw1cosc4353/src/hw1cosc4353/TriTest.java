package hw1cosc4353;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriTest {

	@Test
	void AreaTest() {
		Triangle Tri = new Triangle(3,4,5);
		double result = Tri.area();
		assertEquals(6,result);
	}
}
