package omni;

import static org.junit.Assert.*;

import org.junit.Test;



public class PrimefactorTest {

	@Test
	public void test() {
		
			Primefactor pf=new Primefactor();
			String result=pf.prime(25);
			assertEquals("55",result);
		
	}

}
