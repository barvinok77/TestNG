package core;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
	
	@Test(enabled = true)
	public void test() {
		Assert.assertEquals("abc", "abc", "Error message");
	}
}
