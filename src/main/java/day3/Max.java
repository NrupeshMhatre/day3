package day3;

public class Max {

	public static void main(String[] args) 
	{
		int arr[]= {2,4,5,7,3,8};
		int max=0;
		for(int i=1;i<arr.length;i++)
		{
			if(max< arr[i])
			{
				max=arr[i];
			}
			
		}
     System.out.print("Maximum number is :"+max);
	}
}
