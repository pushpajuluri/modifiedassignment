package weekendtest;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class Quadratic2Test {
	@Test
	public void test() {
		Quadrantic2 q=new Quadrantic2();
		Quad p=q.solveBiquadratic(1.0,3.0,0.0);
		double x1=p.getX1();
		double x2=p.getX2();
		double x3=p.getX3();
		double x4=p.getX4();
		assertEquals(0,x1,0);
		assertEquals(0,x2,0);
		assertEquals(3,x3,0);
		assertEquals(-3,x4,0);
	}
		public void test1() {
			Quadrantic2 q2=new Quadrantic2();
			Quad q21=q2.solveBiquadratic(1, 5, 6);
			double x5=q21.getX1();
			double x6=q21.getX2();
			double x7=q21.getX3();
			double x8=q21.getX4();
			assertEquals(0,x5,0);
		    assertEquals(-3,x6,0);
			assertEquals(3,x7,0);
			assertEquals(-2,x8,0);
		}
		
		
	}




