//package assignments;
//using an unsorted array to implement PQ
//add method: insert new item at the end of the array without sorting
//remove method: find the largest item to delete after comparing each item value in the array

public class UnsortedQ{
	static int first, end, length;
	static int arr[];
	//create constructor
	UnsortedQ(int n){
		first=end=0;
		length=n;
		arr= new int[length];
	}
	
// create add method, simply add new item at the end of the array
	void add(int item) {
		//first to check whether the queue is full or not
		if(length==end) {
			System.out.println("Queue is empty");
			return;
		}else {
			arr[end]=item; //insert the element at the end
			end++;
		}
	}
	
//	create remove method, need to locate the minimum item in the array, then remove it
	int remove() {
		int temp;
		int i,min=0;
		//first to check whether the queue is empty
		if(first==end) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			for(i=0;i<end;i++) {
				if(arr[min]>arr[i]) {
					min=i;	// locate the min item index
				}
			}temp=arr[min]; 
			arr[min]=arr[end-1];//replace the min
			end=end-1;	
			return temp;
		}
	}
	
//	create display method to print out the array
	public static void display() {
		int i;
		if(first==end) {
			System.out.println("Queue is empty");
			return;
		}else {
			for(i=first; i<end;i++) {
				System.out.print(arr[i]+" ");
			}
			return;
		}
	}

	/*
	public static void main(String[] args) {
		UnsortedQ q=new UnsortedQ(5);
		q.display();
		q.add(1);
		q.add(5);
		q.add(3);
		q.add(7);
		q.add(6);
		System.out.println("before delete");
		q.display();
		q.remove();
		System.out.println("after delete the min");
		q.display();
	}
	*/

}
