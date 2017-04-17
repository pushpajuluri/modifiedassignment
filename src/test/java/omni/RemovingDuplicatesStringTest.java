package omni;

import static org.junit.Assert.*;


import org.junit.Test;



public class RemovingDuplicatesStringTest {

	@Test
	public void test() {
		RemovingDuplicatesString rd=new RemovingDuplicatesString();
		String result=rd.removing(new int[]{1,1,2,3,4,5});
		assertEquals("12345",result);
	}

}
