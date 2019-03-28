import static org.junit.Assert.*;

import org.junit.Test;

public class StringEmpty {

	@Test
	public void test() {
		int num2=Get.getIndexLast("", 'o');
		assertEquals(num2,-2);
	}

}
