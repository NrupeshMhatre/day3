package day3;

public class Freq2 {

	public static void main(String[] args) 
	{
		int arr[]= {2,3,4,2,3,5,8,5};
		int f[]= {-1,-1,-1,-1,-1,-1,-1,-1};
		
		for(int i=0;i<arr.length;i++)
		{
		    int count=1;
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					f[j]=0;
				}
			}
			if(f[i]!=0) 
			{
				f[i]=count;
			}
		
		}
		for(int i=0;i<arr.length;i++)
		{
			if(f[i]!=0)
			{
				System.out.println(arr[i]+"comes"+f[i]+"times");
			}
		}

	}

}
