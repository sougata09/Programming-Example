
public class BubbleSort {
	
	void sort(int arr[])
	{
		int n = arr.length;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j+1]<arr[j])
				{
					int temp = arr[j];
				    arr[j] = arr[j+1];
				    arr[j+1] = temp;	
				}
		    }
	}
	}
	void print(int arr[])
	{
		for(int i=0;i<arr.length-1;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 BubbleSort ob = new BubbleSort();
	        int arr[] = {64,25,12,22,11};
	        ob.sort(arr);
	        System.out.println("Sorted array");
	        ob.print(arr);
	}

}
