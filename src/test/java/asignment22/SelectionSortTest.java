package asignment22;

import static org.junit.Assert.*;


import org.junit.Test;

public class SelectionSortTest {

	@Test
	public void test() {
		SelectionSort ss=new SelectionSort();
		 int[] arr1 = {10,34,2,56,7,67,88,42};
		 
	        String arr2 =ss.doSort(arr1);
	        assertEquals("27103442566788",arr2);
	        //int[] arr11 = {10,34,2,56,7,67,88,42};
	       // int[] arr12 = {2,7,10,34,42,56,67,88};
	      //int[]  arr13=ss.doSort(arr1);
	     // assertEquals(arr12, arr13);
	        
	}

}
