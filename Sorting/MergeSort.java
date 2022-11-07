
//For merge sort, first divide the 
public class MergeSort {

	void sort(int arr[]){
//		divide
		if(arr.length<2) {//if array element is less than 2, return itself
			return;
		}
		
		int midPoint= arr.length/2; // if the length is even, then round down the number
		int l[]= new int[midPoint];
		int r[]= new int[arr.length-midPoint];
		
		for(int i=0; i<midPoint; i++) {//copy data to temp arrays
			l[i]=arr[i];
		}
		for(int i=midPoint; i<arr.length; i++) {
			r[i-midPoint]=arr[i];
		}
//		System.out.println("left: "+l[0]);
//		System.out.println("right: "+r[0]);
		
		//sorting arrays
		sort(l); 
		sort(r);
		
		merge(arr,l,r); // merge the sorted left and right arrays
	}
	
//	Conquer
	void merge(int arr[], int l[], int r[]){
		int i=0,j=0,k=0; 
		while(i< arr.length/2 && j<arr.length-arr.length/2) {//compare arrays and merge the sub array
			if(l[i]<=r[j]) {
				arr[k]=l[i];
				k++;
				i++;
			}else {
				arr[k]=r[j];
				k++;
				j++;
			}
		}
		while(i< arr.length/2) {//copy the remaining items to the array 
			arr[k]=l[i];
			k++;
			i++;
		}
		while(j<arr.length-arr.length/2) {
			arr[k]=r[j];
			k++;
			j++;
		}
	}

	static void print(int arr[]) {
		if(arr.length==0) {
			System.out.println("Array is empty");
			return;
		}else {
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");
			}
		}

	}
	
//	For test purpose only
//	public static void main(String[] args) {
//		int arr[] = {12,11,13,5,6};
//		MergeSort ms=new MergeSort();
//		ms.sort(arr);
//		
//		ms.print(arr);
//	}

}
