import java.util.Scanner;

public class BinarySearch {
	
	public static int BNSearch(int arr[],int l,int r,int j)
	{
		if(r>=l)
		{
		int mid = l + (r-l)/2;
		if(arr[mid] == j)
			return mid;
		if(arr[mid] > j)
			return BNSearch(arr,l,mid-1,j);
		
		return BNSearch(arr,mid+1,r,j);
		}
		return -1;
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
		int result = BNSearch(arr,0,n-1,m);
		if(result == -1)
			System.out.println("the element is not present in the array");
		else
			System.out.println("the element is in the index " + result);
	}

}
