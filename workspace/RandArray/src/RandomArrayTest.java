

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomArrayTest {

	RandomArray arrayTest = new  RandomArray();
	
	@Test
	public void test() {
		assertEquals(4, arrayTest.list().length);
	}
}
