package asignment22;

import static org.junit.Assert.*;

import org.junit.Test;

public class BubblesortTest {

	@Test
	public void test() {
		Bubblesort bs=new Bubblesort();
		int[] arr1 = {10,34,2,56,7,67,88,42};
		 
        String arr2 =bs.bubbleSorting(arr1);
        assertEquals("27103442566788",arr2);
	}

}
