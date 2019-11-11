package hw1cosc4353;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IsosTest {

	@Test
	void test() {
		Triangle Tri = new Triangle(3,3,4);
		String result = Tri.isosceles();
		assertEquals("isosceles",result);
	}

}
