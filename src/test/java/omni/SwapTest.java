package omni;

import static org.junit.Assert.*;

import org.junit.Test;



public class SwapTest {

	@Test
	public void test() {
		Swap s=new Swap();
		String result=s.swapnumber(4,7);
		assertEquals("74",result);
	

	}

}
