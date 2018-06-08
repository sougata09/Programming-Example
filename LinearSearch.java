import java.util.Scanner;

public class LinearSearch {
	
	public static void LNSearch(int arr[],int k, int j)
	{
		int flag = 0;
		for(int i=0;i<k;i++)
		{
			if(arr[i] == j)
			    flag = 1;
		}
		if(flag==1)
		{
			System.out.println("the element is in the array");
		}
		else
		{
		System.out.println("the element is not in the array");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner br = new Scanner(System.in);
		System.out.println("Enter the length of the array : ");
		int n = br.nextInt();
		System.out.println("Enter the element of the array : ");
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i] = br.nextInt();
		System.out.println("Enter the element : ");
		int m = br.nextInt();
		LNSearch(arr,n,m);
		
	}

}
