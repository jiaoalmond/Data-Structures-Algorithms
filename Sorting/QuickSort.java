
// get inspired  by https://www.baeldung.com/java-quicksort
class QuickSort{
	static int partitin(int arr[], int start, int end) {
		//define the last element as pivot
		int pivot = arr[end];
		// set pointer pIndex to represent the smaller element
		int pIndex=start;
		for(int i=start; i<end; i++) {
			if(arr[i]<=pivot) {//if i's element is smaller than pivot,swap the two elements 
				swap(arr, i, pIndex);
				pIndex++;//increase index
			}
		}
		swap(arr,pIndex, end);
		return(pIndex);
	}
	
//	create the swap method to swap the i's and j's element
	static void swap(int arr[], int i, int j) {
		int temp= arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	static void sort(int[] arr, int start, int end) {
		if(start<end) {
			int index= partitin(arr, start, end);
			//sort elements before partition and after partition
			sort(arr, start, index-1);
			sort(arr, index+1, end);
		}
	}
	
//	For test purpose only
//	public static void main(String[] args) {
//		int[] data = { 8, 7, 2, 1, 0, 9, 6 };
//	    System.out.println("Unsorted Array");
//	    System.out.println(Arrays.toString(data));
//
//	    int size = data.length;
//
//	    // call quicksort() on array data
//	    QuickSort.sort(data, 0, size - 1);
//
//	    System.out.println("Sorted Array in Ascending Order ");
//	    System.out.println(Arrays.toString(data));
//	}
}






