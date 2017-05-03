package weekendtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class BicycleTest {

	@Test
	public void test() {
		Bicycle bi=new Bicycle(1);
		boolean result=bi.Bicycle(1);
		assertEquals(true,result);
		
		boolean result1=bi.decreaseSpeed();
		assertEquals(false,result1);
		
	}

}
