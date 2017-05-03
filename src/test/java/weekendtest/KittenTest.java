package weekendtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class KittenTest {

	@Test
	public void test() {
		Person p=new Person("juluri");
		Kitten k=new Kitten("pushpa",p);
	
		int p1=k.getAge();
		assertEquals(p1, 0);
		k.haveBirthday();
		int p2=k.getAge();
		assertEquals(p2, 1);
		
		String s="pushpa the Feline is 1 and belongs to juluri";
		String result=k.toString();
		assertEquals(s,result);
	}


}
