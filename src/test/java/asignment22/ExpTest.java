package asignment22;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpTest {

	@Test
	public void test() {
		
		      Exp e =new  Exp();
		  boolean result=e.check("(a)}");	
		  assertEquals(false, result);
		  boolean result1=e.check("");	
		  assertEquals(false, result);
	}

}
