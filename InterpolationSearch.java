
public class InterpolationSearch {
	
	static int arr[] = new int[]{10, 12, 13, 16, 18, 19, 20, 21, 22, 23,
            24, 33, 35, 42, 47};
	 
	public static int Interpolation(int x)
	{
		int lo = 0;
		int hi = (arr.length-1);
		while((lo<=hi) && (x >= arr[lo]) && (x <= arr[hi]))
		{
			int pos = lo + (((hi-lo)/(arr[hi]-arr[lo]))*(x-arr[lo]));
			if(arr[pos] == x)
				return pos;
			if(arr[pos]<x)
				lo = pos + 1;
			else
				hi = lo - 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 18;
		int index = Interpolation(x);
		if(index != -1)
			System.out.println("Element found at index : " + index);
		else
			System.out.println("Element not found : ");
			
	}

}
