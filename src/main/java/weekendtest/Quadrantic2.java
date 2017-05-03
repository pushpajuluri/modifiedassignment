package weekendtest;

public class Quadrantic2 {
	public Quad solveBiquadratic(double a,double b,double c){
		
		double discriminant = b*b - 4*a*c;
		double x1=0;
		double x2=0;
		double x3=0;
		double x4=0;
		if (discriminant < 0)
		
			x1=(-b+Math.sqrt(discriminant))/(2*a);
			x2=(-b-Math.sqrt(discriminant))/(2*a);
			x3=(+b+Math.sqrt(discriminant))/(2*a);
			x4=(+b-Math.sqrt(discriminant))/(2*a);
		Quad p1=new Quad(x1,x2,x3,x4);
			return p1;
	}
		
	}

	

