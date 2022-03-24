package day3;

public class SecondLarge {

	public static void main(String[] args)
	{
		int arr[]= {1,2,3,4,5,6,7};
		int temp,a1=arr.length;
		for(int i=0;i<a1;i++)
		{
			for(int j=i+1;j<a1;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
                    arr[j]=temp;
				}
			}
			
			System.out.println("" +arr[5]);
		}
	}
}