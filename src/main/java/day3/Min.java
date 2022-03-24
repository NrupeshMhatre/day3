package day3;

public class Min {

	public static void main(String[] args)
    {
		int arr[]= {2,4,6,8,7,1};
		int min=arr[0];
		for(int i=1; i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
       System.out.print("Minimun number is:"+min);
	}

}
