import java.util.LinkedList;
import java.util.Queue;
public class Driver {

	public static void main(String[] args) {
		// Lewis University - Programming Fundamentals - Lab 7 Exercise 1
		// Brent Harshbarger
		
		LinkedList list = new LinkedList();
		
		list.add(1);
		list.add(7);
		list.add(3);
		list.add(4);
		list.add(9);
		list.add(2);
		
		System.out.println(list);
		System.out.println("Remove elements in Linked List");
		for(int i = 0; i< 6; i++) {
		System.out.print(list.pop());
		System.out.print(list+", ");
		}
		
		Queue<Integer> a = new LinkedList<Integer>();
		
		a.add(1);
		a.add(7);
		a.add(3);
		a.add(4);
		a.add(9);
		a.add(2);
		
		System.out.println("");
		
		System.out.println("Remove elements in Stack");
		for(int i = 0; i< 6; i++) {
		System.out.print(a.poll());
		System.out.print(a+", ");
		}
		
		
		
		
	}

}
