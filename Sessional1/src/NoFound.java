import static org.junit.Assert.*;

import org.junit.Test;

public class NoFound {

	@Test
	/**
	 * When ch is missing in  String and we find index from last
	 */
	public void test() {
		int num2=Get.getIndexLast("sarwar", 'o');
		assertEquals(num2,-2);
	}

}
