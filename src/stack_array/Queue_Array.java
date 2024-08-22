package stack_array;
import java.util.*;
public class Queue_Array {
	static final int MAX_SIZE=3;
	static int arr[]=new int[MAX_SIZE];
	static int front=-1,rear=-1,element;
	static void insert(int num) {
			arr[++rear]=num;
		}
		//printStack();	
	
	static int delete() {
		if(rear<0) {
			System.out.print("Queue is empty");
			return -1;
		}
		int popElement=arr[++front];
		printQueue();
		return popElement;
	}
	
	static void printQueue() {
		if(front==rear) {
			System.out.print("Queue is Empty\n");
			return;
		}
		for(int i=rear;i>front;i--) {
			System.out.print(arr[i]+" ");
		}System.out.println();
	}
	
	public static void main(String arg[]) {
		Scanner sc=new Scanner(System.in);
		int userInput = 1;
        while (userInput != 0) {
        	System.out.println("Enter the Option :\nInsert 1\nDelete 2\nView 3\t");
			int option=sc.nextInt();
			switch(option) {
			case 1: if(rear==MAX_SIZE-1) {
						System.out.println("Queue is Full");
						break;
					}
					else {
						System.out.println("Enter the Element\t");
						element=sc.nextInt();
	    				insert(element);
	    				break;
					}
			case 2: System.out.println("Deleted Element "+delete());
					break;
			case 3: printQueue();
					break;
			default:
    			System.out.print("Enter the Correct Option");
    			break;
    		}
        	System.out.print("Enter 1 to continue or 0 to terminate the loop: ");
            userInput = sc.nextInt();
        }sc.close();
	}
}
