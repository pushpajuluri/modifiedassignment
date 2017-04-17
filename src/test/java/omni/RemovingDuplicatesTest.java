package omni;

import static org.junit.Assert.*;

import java.util.HashSet;

import org.junit.Test;


public class RemovingDuplicatesTest {

	@Test
	public void test() {
		RemovingDuplicates rd=new RemovingDuplicates();
		HashSet<Integer> hs = new HashSet<Integer>();
	
	
			
				HashSet<Integer> result=rd.remove(new int[]{1,1,3,4});
				hs.add(1);
				hs.add(3);
				hs.add(4);
				
				assertEquals(hs,result);
	}

}
