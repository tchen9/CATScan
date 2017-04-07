//Brooke Jin
//APCS2 pd5
//HW29 -- Stress is the Best
//2017-04-05

public class DequeTester {

    public static void main(String[] args) {

	//creates a new object
	Deque<String> test1 = new Atac<String>();
	
	//adds a String to the front
	test1.addFirst("hello");
	//adds a String to the end
	test1.addLast("2");
	//adds a String to the front
	test1.addFirst("world");
	//adds a String to the end
	test1.addLast("is");
	
	//print the String
	System.out.println(test1);
	
	//removes the first object
	test1.removeFirst();
	
	//prints the first object
	//should be hello
	System.out.println(test1.peekFirst());
	//prints the last object
	//should be is
	System.out.println(test1.peekLast());
	
	//removes the last object
	test1.removeLast();
	//print the String
	System.out.println(test1);
	//removes the first object
	test1.removeFirst();
	//removes the last object
	test1.removeLast();
	//print the String
	System.out.println(test1);
	//should throw an exception, since the String is empty
	//test1.removeFirst();
	
	//prints the first object
	//should be null
	System.out.println(test1.peekFirst());
	//prints the last object
	//should be null
	System.out.println(test1.peekLast());

    }

}
