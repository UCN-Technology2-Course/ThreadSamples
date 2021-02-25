
public class Program {

	// GreetingsThread
//	public static void main(String[] args) throws InterruptedException {
//
//		// Starting program
//		System.out.println("Hello world!");
//
//		// Creating threads
//
//	    GreetingsThread t1 = new GreetingsThread("T1");
//	    GreetingsThread t2 = new GreetingsThread("T2");
//	    GreetingsThread t3 = new GreetingsThread("T3");
//	    GreetingsThread t4 = new GreetingsThread("T4");   
//
//		// Starting threads
//	    t1.start();
//	    t2.start();
//	    t3.start();
//	    t4.start();	
//
//	    t1.join();
//	    t2.join();
//	    t3.join();
//	    t4.join();
//
//		System.out.println("threads started, goodbye cruel world");
//		// Main thread finished
//	}

	// GreetingsRunnable
	public static void main(String[] args) throws InterruptedException {

		// Starting program
		System.out.println("Hello world!");

		// Runnable implementation
		GreetingsRunnable r1 = new GreetingsRunnable("R1");
		GreetingsRunnable r2 = new GreetingsRunnable("R2");
		GreetingsRunnable r3 = new GreetingsRunnable("R3");
		GreetingsRunnable r4 = new GreetingsRunnable("R4");

		Thread tr1 = new Thread(r1);
		Thread tr2 = new Thread(r2);
		Thread tr3 = new Thread(r3);
		Thread tr4 = new Thread(r4);

		tr1.start();
		tr2.start();
		tr3.start();
		tr4.start();

		tr1.join();
		tr2.join();
		tr3.join();
		tr4.join();

		System.out.println("threads started, goodbye cruel world");
		// Main thread finished
	}
}
