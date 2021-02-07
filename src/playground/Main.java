package playground;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

	public static void main(String[] args) {
		//HOMEWORK #3 WRITE METHOD
		
		
		
		
		
//		ArrayList<String> animals = new ArrayList<>();
//		animals.add("dog");
//		animals.add("lion");
//		animals.add("rabbit");
//		animals.add("leopard");
//		
//		animals.add(2, "pineapple");
//		
//		animals.set(0, "caribou");   //replace dog with caribou
//		
//		System.out.println(animals);
		
//		LinkedList<String> places = new LinkedList<String>();
//		
//		places.add("Tahiti");
//		places.add("San Paolo");
//		places.add("Zurich");
//		places.add("Paris");
//		places.add("Tunisia");
//		
//		System.out.println(places);
//		
//		places.remove("Zurich");
//		
//		System.out.println(places);
		
//		Stack<Integer> myStack = new Stack<Integer>();
//		myStack.push(1);
//		myStack.push(2);
//		myStack.push(3);
//		myStack.push(4);
//		myStack.push(6);
//		myStack.push(9);
//		
//		System.out.printf("Pop method give me: %d\n", myStack.pop());
//		System.out.printf("Pop method give me: %d\n", myStack.pop());
//		System.out.printf("Stack has #%d things. \n", myStack.size());
		
		
		  // Queue<String> mvdLine = new LinkedList <>(); // // mvdLine.add("Kee"); //
//		 mvdLine.add("Bertrand"); // mvdLine.add("Cori"); // //
//		 System.out.println(mvdLine); // //
//		 System.out.printf("%s is at the counter\n", mvdLine.remove()); // //
//		 System.out.println(mvdLine); // // mvdLine.add("Luis"); // //
//		 System.out.println(mvdLine);
//		 		
		
		//way to access it
		int base = 4;
		int exp = 2;
		System.out.println(toPower(base, exp));
				
	}
	
	//HOMEWORK #3 WRITE METHOD
	public static double[] toPower(double size, double power) {
		
		double[] frog;
		for(double i = 0; i < size; i++) {
			
			frog[(int)i] = Math.pow( i, power);
		}
		
		return frog;
	}
	 
 //THIS DOESN'T WORK   LOOK IN SLACK FOR CODE EX BY TA
	
}
