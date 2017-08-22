package test;

import org.junit.Assert;
import org.junit.Test;

public class TestAdd {
	@Test
	public void test() {
		int b=Add.TestAdd(5,20);		
		Assert.assertEquals(b,50);
	}
}
