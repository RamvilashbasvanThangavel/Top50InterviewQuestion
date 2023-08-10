package InterviewQuestions;

public class Thread01Runnable implements Runnable {
	@Override
	public void run() {
		synchronized(Thread01Runnable.class) {
		System.out.println("Thread is Running");
		try {
			Thread01Runnable.class.wait(1000); 
			System.out.println("Hello");
		}
		catch (InterruptedException ie) {
			ie.printStackTrace();
		}
			
		}
	}

	public static void main(String[] args) throws InterruptedException {
		Thread01Runnable it1 = new Thread01Runnable();
		Thread t = new Thread(it1);
		t.start();
		Thread.sleep(2000);
		synchronized (t) {
			t.notify();
		}
		System.out.println("Hi");
	}

}
