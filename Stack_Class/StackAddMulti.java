

import java.util.Scanner;

public class StackAddMulti {

	class Node{ 
	   int number; 
	   Node next; 
//	1. create constructor, but this could be optional
	   Node(){
//		   number =number;
		   next=null;
			}
	}
	Node head = null;
	
//	2. create push() method to add value to the top of the list
	public void push(int number) {
		 Node addNode = new Node(); 
		 addNode.number =number; 
		 addNode.next = head; 
		 head = addNode; 
	}
	
//	3.create pop() method to remove the value from the beginning of the list
	public void pop() {
		Integer temp=null;
		// first check if the head is null. If so, report error message or not to simply delete the print message
		if(head==null) {
			System.out.println("There is no value in the list before removing");
		}else {
		temp = head.number;
		head=head.next;
		System.out.println(temp);
		}
	}
	
//  4.override the toString function, similar to the first assignment
	public String toString() throws NullPointerException{
		String print ="";
		Node copyHead = head;
		// create a String, add each element to the string, and add " " after each element.	
		while(copyHead !=null) {
			print += copyHead.number + " ";
			copyHead = copyHead.next;
		}
		return print;
	}
	
//	5.create add() method to plus the last 2 items of the list and push the result to the stack
	public void add() {
		// if the stack is empty, then return nothing
		if(head==null){
//			System.out.println();
		}else if(head.next!=null) {
			int plusValue=head.number+head.next.number;
			//use the push() method to add the value to the stack list
			push(plusValue);
		}
	}
	
//	6.create multiplication() method to multiple the last 2 items of the list and push the result to the stack
	public void multiple() {
		// if the stack is empty, then return nothing
		if(head==null){
//			System.out.println();
		}else if(head.next !=null) {
			int multipleValue= head.number * head.next.number;
			//use the push() method to add the value to the stack list
			push(multipleValue);
		}
	}
	
	public static void main(String[] args) {		
//		create the main method to scanner the user input
		StackAddMulti ls= new StackAddMulti();

		Scanner scanner = new Scanner(System.in);
	    while (true) {
	    	// take the input as a String, 
	    	// and try to cast the string to integer, 
	    	// if the input is a valid, then use the push() method to add the value to the stack
	    	// get inspiration from https://stackoverflow.com/questions/30664657/checking-if-an-input-of-an-integer-is-a-string-with-try-catch
	        String input = scanner.next();
	            try {
	                int a = Integer.parseInt(input);
            		ls.push(a);
	            } catch (NumberFormatException e) {
	            	// if the input is not an integer, it will be treated as an exception and 
	            	// compares it with different symbols like +, *, ? and $
	            	// and execute based on the instruction
	            	// other symbols will be ignored. 
	            	if(input.equals("+")) {
	            		ls.add();
	            	}
	            	if(input.equals("*")){
	            		ls.multiple();
	            	}
	            	if(input.equals("?")){
	            		System.out.println(ls);
	            	}
	            	if(input.equals("P") || input.equals("p")){
	            		ls.pop();
	            	}
	            	if(input.equals("$")){
	            		break;
	            	}
	            }
	        }
	    }
}
