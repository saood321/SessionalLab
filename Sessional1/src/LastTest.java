import static org.junit.Assert.*;

import org.junit.Test;

public class LastTest {

	@Test
	/**
	 * When ch is at end of String and we find index from last
	 */
	public void test() {
		int num2=Get.getIndexLast("sarwar", 'r');
		assertEquals(num2,6);
		
	}

}
