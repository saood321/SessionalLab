import static org.junit.Assert.*;

import org.junit.Test;

public class NoFoundFirst {

	@Test
	/**
	 * When ch is missing in  String and we find index from start
	 */
	public void test() {
		int num2=Get.getIndexFirst("sarwar", 'o');
		assertEquals(num2,-1);
	}

}
