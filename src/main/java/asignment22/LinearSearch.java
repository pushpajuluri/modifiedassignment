package asignment22;

public class LinearSearch {
	  
public	 boolean searchelement(int numList[], int toSearch) {  
	  int foundIndex = 0;  
	  for (int i = 0; i < numList.length; i++) {  
	  
	   if (numList[i] == toSearch) {  
		   return true;
	   }  
	  }  
	  return false;  
	 }
 
	}  

