package omni;

public class PalindromeNumber {
public boolean isPalindrome(String name){
		
		if (name.length()==0 || name.length()==1)
			return true;
		
		if(name.charAt(0) == name.charAt(name.length()-1))
			return isPalindrome(name.substring(1,name.length()-1));
		
		return false;
	}


}
