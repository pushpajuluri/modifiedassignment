package omni;

public class Swap {
	String s="";
	 public String swapnumber(int x,int y){
		 x = x + y;  
		  y = x - y;  
		  x = x - y;
		 s=s+String.valueOf(x)+String.valueOf(y);
		 return s;
	 }
}
