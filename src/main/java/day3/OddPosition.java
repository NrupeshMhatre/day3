package day3;

public class OddPosition {

	public static void main(String[] args) 
	{
	char arr[]={'a','b','c','d','e','d','e'};
	for( int i=1;i<arr.length;i=i+2)
	{
	System.out.println("position:" + i + " value:"+ arr[i]);
	}

	}

}
