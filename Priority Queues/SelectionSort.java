//package assignments;
//always put the minimum value at the beginning from the unsorted array 
public class SelectionSort {

	void sort(int arr[]) {
		for(int i=0; i<arr.length-1;i++) {
			int min=i;
			
//			identify the min value index
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
// create print method to print out the array	
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
	
	
	
/*	
	public static void main(String[] args) {
        int arr[] = { 12, 11, 13, 5, 6 };
        
        SelectionSort ob = new SelectionSort();
        ob.sort(arr);
        print(arr);
	}
	*/

}
