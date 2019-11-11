package hw1cosc4353;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ScalTest {

	@Test
	void test() {
		Triangle Tri = new Triangle(3,4,5);
		String result = Tri.scalene();
		assertEquals("scalene",result);
	}

}
