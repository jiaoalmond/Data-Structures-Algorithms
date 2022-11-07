
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Random rd = new Random(); // creating Random object
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
		arr[i] = rd.nextInt(100);  // storing random integers in an array
		// System.out.println(arr[i]); // printing each array element
		}

//	1.	Test on 10 random numbers
		System.out.println("1. Test on 10 random numbers with Buble Sort, Merge Sort and Quick Sort");
		System.out.println("The unsorted array:" + Arrays.toString(arr));
		BubleSort bs= new BubleSort();
		bs.sort(arr);
		System.out.print("Buble sorting array: ");
		System.out.print(Arrays.toString(arr));
		
		MergeSort ms=new MergeSort();
		ms.sort(arr);
		System.out.print("\nMerge sorting array: ");
		System.out.print(Arrays.toString(arr));
		
		QuickSort qs=new QuickSort();
		QuickSort.sort(arr, 0, arr.length-1);
		System.out.print("\nQuick sorting array: ");
		System.out.print(Arrays.toString(arr));
		
//	2.	Timing Bubble sort, Merge sort and Quick sort with 100 random numbers
		int[] arr100 = new int[100];
		for (int i = 0; i < arr100.length; i++) {
		arr100[i] = rd.nextInt(100); // storing random integers in an array
		// System.out.println(arr100[i]); // printing each array element
		}
		
		System.out.println("\n\n2. Timing the three sorting methods with 100 inputs:");
		double startTime = System.nanoTime();
		bs.sort(arr100);
		double endTime = System.nanoTime();
		double duration = (endTime - startTime); //divide by 1000000 to get milliseconds.
		System.out.println("Time usage for Buble sorting: "+ duration/1000000);
		
		
		double startTime2 = System.nanoTime();
		ms.sort(arr100);
		double endTime2 = System.nanoTime();
		double duration2 = (endTime2 - startTime2); //divide by 1000000 to get milliseconds.
		System.out.println("Time usage for Merge sorting: "+ duration2/1000000);
		
		double startTime3 = System.nanoTime();
		qs.sort(arr100, 0, arr.length-1);
		double endTime3 = System.nanoTime();
		double duration3 = (endTime3 - startTime3); //divide by 1000000 to get milliseconds.
		System.out.println("Time usage for Quick sorting: "+ duration3/1000000);
		
//	3.	Time the three sorting methods for 10 times, and find the average
		System.out.println("\n3. Run the three sorting methods for 10 times to find the average time\n");
		
//		create a loop to run the test
			double durationL=0;
			double sumL=0;
			for(int j=1;j<=10;j++) {
				for (int i = 0; i < arr100.length; i++) {
					arr100[i] = rd.nextInt(100); 
				}
				double startTimeL = System.nanoTime();
//				System.out.println("New random array: ");//print out the different array if you want to
//				System.out.print(Arrays.toString(arr100));
				bs.sort(arr100);
//				System.out.print("Sorted array: "+Arrays.toString(arr100));//after sorted array
				double endTimeL = System.nanoTime();
				durationL = (endTimeL - startTimeL);
				sumL += durationL;
				System.out.println("No."+j+" Bubble sorting:"+durationL/1000000);
			}
			System.out.println("Bubble sorting average time:"+sumL/1000000/10 +"\n");
			
			double durationLMS=0;
			double sumLMS=0;
			for(int j=1;j<=10;j++) {
				for (int i = 0; i < arr100.length; i++) {
					arr100[i] = rd.nextInt(100); 
				}
				double startTimeLMS = System.nanoTime();
//				System.out.println("New random array: ");//print out the different array if you want to
//				System.out.print(Arrays.toString(arr100));
				ms.sort(arr100);
				double endTimeLIS = System.nanoTime();
				durationLMS = (endTimeLIS - startTimeLMS);
				sumLMS +=durationLMS;
				System.out.println("No."+j+" Merge sorting:"+durationLMS/1000000);
			}
			System.out.println("Merge sorting average time:"+sumLMS/1000000/10+"\n");

			double durationLQS=0;
			double sumLQS=0;
			for(int j=1;j<=10;j++) {
				for (int i = 0; i < arr100.length; i++) {
					arr100[i] = rd.nextInt(100); 
				}
				double startTimeLQS = System.nanoTime();
//				System.out.println("New random array: ");//print out the different array if you want to
//				System.out.print(Arrays.toString(arr100));
				qs.sort(arr100,0,arr100.length-1);
				double endTimeLQS = System.nanoTime();
				durationLQS = (endTimeLQS - startTimeLQS);
				sumLQS +=durationLQS;
				System.out.println("No."+j+" Quick sorting:"+durationLQS/1000000);
			}
			System.out.println("Quick sorting average time:"+sumLQS/1000000/10+"\n");
	}

}
