package hw1cosc4353;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RightTest {

	@Test
	void test() {
		Triangle Tri = new Triangle(3,4,5);
		String result = Tri.right();
		assertEquals("right",result);
	}

}
