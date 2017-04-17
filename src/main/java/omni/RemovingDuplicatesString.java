package omni;

public class RemovingDuplicatesString {
	public String removing(int s[]){
		
		
		int l=0;
		if(s!=null)
		
	
	
	 l=s.length;
	
	String ans="";
	for(int i=0;i<l;i++)
		{
		
		
			ans=ans+s[i];
		s[i]=0;
		
		
		}
	
	return ans;
	}


}
