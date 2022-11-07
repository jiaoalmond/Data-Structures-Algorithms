//package assignments;
import java.util.Random;

class Main {
	static HeapSortEx hsePerf=new HeapSortEx();
	
	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object

		int[] arr = new int[100];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(100); // storing random integers in an array
//			 System.out.println(arr[i]); // printing each array element
		}
		
		
//	1. Demonstrate Heap, SortedPQ and UnsortedPQ with 6 items
		System.out.println("Demonstrate Heap, SortedPQ and UnsortedPQ");
		int arrTest[] = { 1, 12, 9, 5, 6, 10 };
		System.out.println("The unsorted array: " +"1, 12, 9, 5, 6, 10 ");
		HeapSortEx hse = new HeapSortEx();
		hse.sort(arrTest);
		System.out.print("Heap Sorting result: ");
		HeapSortEx.printArray(arrTest);
		
		SortedQ sq= new SortedQ(6);
		sq.add(1);
		sq.add(12);
		sq.add(9);
		sq.add(5);
		sq.add(6);
		sq.add(10);
		System.out.print("Sorted Queue result: ");
		sq.display();
		
		UnsortedQ uq=new UnsortedQ(6);
		uq.add(1);
		uq.add(12);
		uq.add(9);
		uq.add(5);
		uq.add(6);
		uq.add(10);
		System.out.print("\nUnsorted Queue result: ");
		uq.display();
		System.out.println("\nRemoving from Unsorted Q: "+uq.remove());
		System.out.println("Removing from Unsorted Q: "+uq.remove());
		System.out.println("Removing from Unsorted Q: "+uq.remove());
		System.out.println("Removing from Unsorted Q: "+uq.remove());
		System.out.println("Removing from Unsorted Q: "+uq.remove());
		System.out.println("Removing from Unsorted Q: "+uq.remove());

		
// 2. Time Heap sort, Insertion Sort and Selection Sort
		System.out.println("\nTiming the three sorting methods with 100 inputs:");
		
		double startTime2 = System.nanoTime();
	    HeapSortEx hse1 = new HeapSortEx();
	    hse1.sort(arr);
		double endTime2 = System.nanoTime();
		double duration2 = (endTime2 - startTime2); //divide by 1000000 to get milliseconds.
		System.out.println("Time usage for Heap sorting: "+duration2/1000000);
		hse1.printArray(arr);
		
		
		double startTime1 = System.nanoTime();
        InsertionSort is = new InsertionSort();
        is.sort(arr);
		double endTime1 = System.nanoTime();
		double duration1 = (endTime1 - startTime1); 
		System.out.println("Time usage for Insertion sorting: "+duration1/1000000);
		is.print(arr);
		
		
		double startTime = System.nanoTime();
        SelectionSort ss = new SelectionSort();
        ss.sort(arr);
		double endTime = System.nanoTime();
		double duration = (endTime - startTime); 
		System.out.println("\nTime usage for Selection sorting: "+duration/1000000);
		ss.print(arr);
	
// 3. Time the three sorting methods for 10 times, and find the average   
		System.out.println("\n\nRun the three sorting methods for 10 times to find the average time");
		
//	create a loop to run the test
		double durationL=0;
		double sumL=0;
		for(int j=1;j<=10;j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt(100); 
			}
			double startTimeL = System.nanoTime();
			hse.sort(arr);
			//System.out.println("New random array: ");//print out the different array if you want to
			//hse.printArray(arr);
			double endTimeL = System.nanoTime();
			durationL = (endTimeL - startTimeL);
			sumL += durationL;
			System.out.println("No."+j+" Heap sorting:"+durationL/1000000);
		}
		System.out.println("Heap sorting average time:"+sumL/1000000/10);
		
		
		
		double durationLIS=0;
		double sumLIS=0;
		for(int j=1;j<=10;j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt(100); 
			}
			double startTimeLIS = System.nanoTime();
			is.sort(arr);
//			System.out.println("New random array: ");//print out the different array if you want to
//			is.print(arr);
			double endTimeLIS = System.nanoTime();
			durationLIS = (endTimeLIS - startTimeLIS);
			sumLIS +=durationLIS;
			System.out.println("No."+j+" Insertion sorting:"+durationLIS/1000000);
		}
		System.out.println("Insertion sorting average time:"+sumLIS/1000000/10);
		
		
		double durationLSS=0;
		double sumLISS=0;
		for(int j=1;j<=10;j++) {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = rd.nextInt(100);
			}
			double startTimeLSS = System.nanoTime();
			ss.sort(arr);
//			System.out.println("New random array: ");//print out the different array if you want to
//			is.print(arr);
			double endTimeLSS = System.nanoTime();
			durationLSS = (endTimeLSS - startTimeLSS);
			sumLISS +=durationLSS;
			System.out.println("No."+j+" Selection sorting:"+durationLSS/1000000);
		}
		System.out.println("Selection sorting average time:"+sumLISS/1000000/10);
		
		
	}

}