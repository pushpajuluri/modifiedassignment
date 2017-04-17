package omni;

import static org.junit.Assert.*;

import org.junit.Test;



public class PalindromeNumberTest {

	@Test
	public void test() {
		PalindromeNumber p=new PalindromeNumber();
		boolean result=p.isPalindrome("malayalam");
		assertEquals(result,true);
	}

}
