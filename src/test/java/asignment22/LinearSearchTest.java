package asignment22;

import static org.junit.Assert.*;


import org.junit.Test;



public class LinearSearchTest {

	@Test
	public void test() {
	LinearSearch ls=new LinearSearch();
	int num[] = {10,20,30,40,50};
	int searchNum = 40;
	boolean result=ls.searchelement(num,searchNum);
	  assertEquals(result,true);
	}
}

