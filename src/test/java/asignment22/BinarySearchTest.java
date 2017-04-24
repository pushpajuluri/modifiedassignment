package asignment22;

import static org.junit.Assert.*;


import org.junit.Test;

public class BinarySearchTest {

	@Test
	public void test() {
		BinarySearch bs=new BinarySearch();
		 int numList[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 };  
		  int toSearch = 12;  
		  int reasult=bs.search(numList, toSearch);
assertEquals(reasult, 2);
int numList1[] = { 1, 3, 8, 12, 34, 56, 78, 87, 92 };  
int toSearch1 = 12;  
int reasult1=bs.search(numList, toSearch);
assertEquals(reasult1, 3);
}
}
