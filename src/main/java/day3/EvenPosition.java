package day3;

public class EvenPosition {

	public static void main(String[] args) 
	{
	int arr[]={2,1,4,3,6,5,7};
	for(int i=2;i<arr.length;i=i+2)
	{
	System.out.println("position:" + i + " value:"+ arr[i]);
	}

	}

}
