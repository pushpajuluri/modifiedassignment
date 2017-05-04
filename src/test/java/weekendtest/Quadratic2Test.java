package weekendtest;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class Quadratic2Test {
	@Test
	public void test() {
		Quad q=new Quad();
		Quad p=q.solveBiquadratic(1.0,3.0,0.0);
		double x1=p.getX1();
		double x2=p.getX2();
		double x3=p.getX3();
		double x4=p.getX4();
		assertEquals(double.NaN,x1,0);
		assertEquals(double.NaN,x2,0);
		assertEquals(0,x3,0);
		assertEquals(0,x4,0);
	}
		
		
	}




