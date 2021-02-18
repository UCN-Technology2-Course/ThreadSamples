
public class Program {

	public static void main(String[] args) {

		// Starting program
	    System.out.println("Hello world!\n");

	    // Running threads
	    GreetingsThread t1 = new GreetingsThread("T1");
	    GreetingsThread t2 = new GreetingsThread("T2");
	    GreetingsThread t3 = new GreetingsThread("T3");
	    GreetingsThread t4 = new GreetingsThread("T4");

	    t1.start();
	    t2.start();
	    t3.start();
	    t4.start();
	    
	    
	    System.out.println("threads started, goodbye cruel world \n");
	    // Main thread finished
	}

}
