import static org.junit.Assert.*;

import org.junit.Test;

public class FirstTest {

	@Test
	/**
	 * When ch is at start of String and we find index from start
	 */
	public void test() {
		int num1=Get.getIndexFirst("Sarwar", 'S');
		assertEquals(num1,1);
	}

}
