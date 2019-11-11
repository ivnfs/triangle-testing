package hw1cosc4353;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EquilatTest {

	@Test
	void test() {
		Triangle Tri = new Triangle(3,3,3);
		String result = Tri.equilateral();
		assertEquals("equilateral",result);
	}

}
