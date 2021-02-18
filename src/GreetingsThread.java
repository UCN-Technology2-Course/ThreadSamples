
public class GreetingsThread extends Thread {

	private String name;
	
	public GreetingsThread(String name) {
		super();
		this.name = name;
	}

	public void run(){
		
		long sleep = (long) (Math.random() * 1000);

		System.out.println("Hello from "+ name +" thread");
		
		try {
			
			Thread.sleep(sleep);
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		
		System.out.println("Goodbye from "+ name +" thread, slept for "+ sleep +" milliseconds");
	}
}
