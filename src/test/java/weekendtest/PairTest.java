package weekendtest;

import static org.junit.Assert.*;

import org.junit.Test;

public class PairTest {

	@Test
	public void test() {
		Quadratic q=new Quadratic();
		Pair p=q.solveQuadratic(1.0,5.0,6.0);
		double x1=p.getX();
		double x2=p.getY();
		assertEquals(0,x1,0);
		assertEquals(-3,x2,0);
	}
		public void test3() {
			Quadratic q=new Quadratic();
			Pair p=q.solveQuadratic(3,9,1);
			double x1=p.getX();
			double x2=p.getY();
			assertEquals(0,x1,0);
			assertEquals(-3,x2,0);
		
		
	}

}