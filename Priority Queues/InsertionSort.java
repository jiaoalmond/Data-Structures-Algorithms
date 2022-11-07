//package assignments;
//compare each item with its all predecessor, if they are smaller, then switch position
public class InsertionSort {

	void sort(int arr[]) {
		for(int i=1; i<arr.length;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && temp<arr[j] ) { //compare the item one by one
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
//asc sorted
/*
	void sort2(int arr[]) {
		for (int i = 1; i < arr.length - 1; i++) {
			int min = arr[i];
			int j = i - 1;
			int next = arr[j];
			while (j>=0 && min > next) {
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j+1] = min;
		}
	}
	*/
	
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
	
	
	public static void main(String[] args) {
		
        int arr[] = { 12, 11, 13, 5, 6 };
        
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);

        print(arr);
	}

}
