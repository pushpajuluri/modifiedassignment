package weekendtest;

public class Quadratic {
	
public Pair solveQuadratic(double a, double b, double c) {
		double discriminant = b*b - 4*a*c;
		double x1=0;
		double x2=0;
		if (discriminant < 0)
		
			x1=(-b+Math.sqrt(discriminant))/(2*a);
			x2=(-b-Math.sqrt(discriminant))/(2*a);
			Pair p1=new Pair(x1,x2);
			return p1;
	}

}
