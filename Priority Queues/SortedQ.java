//package assignments;
//using a sorted array to implement PQ
//add method: insert new item at the appropriate position by comparing each item 
//remove method: since the queue is always sorted, delete the last item

public class SortedQ {
	static int first, end, length;
	static int arr[];
	//create constructor
	SortedQ(int n){
		first=end=0;
		length=n;
		arr= new int[length];
	}
	
//	create add method to insert element at the right position
	public static void add(int item) {
		// first to check whether the queue is full or not
		if(length==end) {
			System.out.println("Queue is empty");
			return;
		}else {
			int i=end-1;
			while(i>=0 && item<arr[i]) {
				arr[i+1]=arr[i];
				i--;
			}
			arr[i+1]=item; // insert the element at the right position
			end++;
		}
	}
	
//	create remove method to delete the last element
	int remove() {
		// first to check whether the queue is empty
		int item;
		if(end==0) {
			System.out.println("Queue is empty");
			return -1;
		}else {
			item=arr[end-1];
			end=end-1;
			return item;
		}
	}
	//get inspired by the following link https://algorithmtutor.com/Data-Structures/Tree/Priority-Queues/
	
//	create display method to print out the array
	 void display() {
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
		SortedQ sq=new SortedQ(6);
		sq.add(1);
		sq.add(5);
		sq.add(3);
		sq.add(4);
		sq.add(8);
		sq.add(7);
		sq.remove();
		sq.display();	
	}
	*/
	
}
