
public class BubleSort {
	void sort(int arr[]){
		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-i-1; j++) {
				int temp=arr[j];
				if(arr[j]>arr[j+1]) {//compare each element in the array
					arr[j]=arr[j+1];
					arr[j+1]=temp;
//					System.out.println(arr[j]);
				}
			}		
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
//		 int arr[] = { 12, 11, 13, 5, 6 };
//		 BubleSort bs= new BubleSort();
//		 bs.sort(arr);
//		 bs.print(arr);
//	}

}
