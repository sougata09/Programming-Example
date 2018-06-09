
public class SelectionSort {
	
	void sort(int arr[])
	{
		int n = arr.length;
		int min = 0 ;
		for(int i=0;i<n-1;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
					min = j;
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
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

		 SelectionSort ob = new SelectionSort();
	        int arr[] = {64,25,12,22,11};
	        ob.sort(arr);
	        System.out.println("Sorted array");
	        ob.print(arr);
	}

}
