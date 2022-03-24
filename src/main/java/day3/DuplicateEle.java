package day3;

public class DuplicateEle {

	public static void main(String[] args)
	{
      int arr[]= {3,1,0,5,1,9,9,9,3,2,1,5};
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=i+1;j<arr.length;j++)
    	  {
    		  if(arr[i]==arr[j])
    		  {
    			  System.out.println("Repeat Element:"+arr[j]);
    		  }
    	  }
      }
      
	}

}
