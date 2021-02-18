
public class GreetingsRunnable implements Runnable {
	
	private String name;

	public GreetingsRunnable(String name) {
		super();
		this.name = name;
	}

	public void run(){
		
		long sleep = (long) (Math.random() * 1000);

		System.out.println("Hello from "+ name +" runnable");
		
		try {
			
			Thread.sleep(sleep);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Goodbye from "+ name +" runnable, slept for "+ sleep +" milliseconds");
	}
}
