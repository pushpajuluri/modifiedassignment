package omni;


	import java.util.HashSet;
	public class RemovingDuplicates {

		public HashSet<Integer>remove(int[] arr)
		{
			HashSet<Integer> al=new HashSet<Integer>();
			
			for(int i=0;i<arr.length;i++)
				al.add(arr[i]);
			
			return al;	
		}
 }



