//Jinyu JIAO 260881046

class main{
	public static void main(String[] args) {
		LinkedList list1= new LinkedList();
		LinkedList list2= new LinkedList();
		LinkedList list3= new LinkedList();
		
		list1.add(1); 
		list1.add(3); 
		list1.add(2); 

		list2.add(1); 
		list2.add(2); 
		list2.add(3); 
		
		list3.add(1);
		list3.add(3);
		list3.add(2);

	    System.out.println("list1: " + list1 
				    		+"\n" +"list2: "+list2
				    		+"\n" +"list3: "+list3);
	    System.out.println("\n"+"Here is the result:");
	    System.out.println("List1 size is: "+list1.size());
	    System.out.println("Check whether list1 contains value: "+list1.contain()); 
	    System.out.println("Using compare() to check whether list1 is same as list2: "
	    					+list1.compare(list2) 
	    					+"\n"+"Using compare() to check whether list1 is same as list3: "
	    					+list1.compare(list3));
		System.out.println("Using magicCompare() to check whether list1 and list2 have the same value: "
	    					+ list1.magicCompare(list1, list2));
		list1.remove(2);
		System.out.println("After removing 2 from the List1: " + list1);

	    
	}
}


class LinkedList {

	class Node{
		int number;
		Node next;

//	1. create constructor, but this could be optional
		Node(){
			this.number =number;
			next=null;
		}
	}

	Node head = null;
	
//	2. create the add method as teacher did in the class
	public void add(int number) {
		 Node addNode = new Node(); 
		 addNode.number =number; 
		 addNode.next = head; 
		 head = addNode; 
	}
	
//	3. remove a given value if the linked list has it. 
//	Got inspired from the following reference: https://www.geeksforgeeks.org/linked-list-set-3-deleting-node/
	void remove(int number){
		Node removeNode = head;
		Node nextNode = null;
		try {
			if(removeNode == null) {
				return;
			}
//	if the first element of the list equals to the given value, update it with the next value.
			if(removeNode != null && removeNode.number ==number) {
				head = removeNode.next;
				return;
			}
//	if the first element of the list does not equal to the given value, move to the next value
			while(removeNode != null && removeNode.number !=number) {
				nextNode=removeNode;
				removeNode=removeNode.next;	
			}
			nextNode.next=removeNode.next;
		}catch(Exception e) {
			System.out.println(number + " is not in the list. "); //catch the error message
		}
		
	}
	
//	4. return the size of the list
	int size() {
		int size=0;
		Node copyHead=head;
		if(copyHead ==null) {
			return size;
//	increase the size value if the list is not empty, and move to the next value to continue to check
		}else if(copyHead !=null) {
			while(copyHead !=null) {
				size +=1;
				copyHead=copyHead.next;
			}
		}
		return size;		
	}
	
//	5. check if the list has a value
	boolean contain() {
		boolean status=true;
		if(head != null) {
			return status;
		}else if(head ==null) {
			return status=false;
		}
		return status;
	}
	
//	6. override the toString function
	public String toString() throws NullPointerException{
		String print ="";
		Node copyHead = head;
//	create a String, add each element to the string, and add "," after each element.	
		while(copyHead !=null) {
			print += copyHead.number;
			copyHead = copyHead.next;
			if(copyHead !=null) {
				print +=  ",";
			}
		}
		return print;
	}

//	7. check whether the two lists have the save value at the same position
	public boolean compare(LinkedList list) {
		Node list1=head;
		Node list2=list.head;
		if(list1==null && list2==null) {
			return true;
		}else if(list1==null || list2==null) {
			return false;
		}
//	create a loop to check each value among the list accordingly. 
		while(list1 !=null && list2 !=null ){
			if(list1.number==list2.number) {
				list1 = list1.next;
				list2 = list2.next;	
			}else {
				return false;
			}	
		}
		return true;
	}
	
//	8.1 create the sort() method as a helper for the magicCompare() method
	 public void sort(){
		 Node sortNode=head;
		 Node nextNode=null;
		 int max; //create a tempt integer to store the currently max value
		 if(sortNode==null) {
			 return;
		 }
//	if the list has only one element, we will move to check the next element 
		 while(sortNode !=null) {
			 nextNode=sortNode.next; 
			 while(nextNode !=null) {
//	compare the two elements, store the max value and iterator the next element, and next next element
				 if(nextNode.number > sortNode.number) {
					max = nextNode.number;
					nextNode.number =sortNode.number;
					sortNode.number=max;
				 }
				 nextNode=nextNode.next;
			 }
			 sortNode=sortNode.next;
		 }		 
	 }
	
//	8.2 create the magicCompare() method with the helper method --sort() that I created above
	public boolean magicCompare(LinkedList list1, LinkedList list2) {
		//sort the two linked list first, then compare them with the compare() method
		LinkedList listCompar1= new LinkedList();
		LinkedList listCompar2= new LinkedList();
		
		listCompar1.sort();
		listCompar2.sort();
		if(listCompar1.compare(listCompar2) == true) {
			return true;
		}
		return false;
	}
}


