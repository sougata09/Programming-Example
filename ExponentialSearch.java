import java.util.Arrays;
public class ExponentialSearch {

	public static int Exp(int arr[],int n,int x)
	{
		if(arr[0] == x)
			return 0;
		int i = 1;
		while((i<n) && (arr[i]<=x))
			i=i*2;
		return Arrays.binarySearch(arr,i/2,Math.min(i, n),x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 int arr[] = {2, 3, 4, 10, 40};
	        int x = 4;
	        int result = Exp(arr, arr.length, x);
	        System.out.println((result<0) ? "element not found" : "element found at index :" + result);
	}

}
