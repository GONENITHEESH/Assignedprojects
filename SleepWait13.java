package Assistedpracticeproject;

public class SleepWait13 {

	private static Object obj = new Object();

	public static void main(String[] args) throws InterruptedException {
		     Thread.sleep(3000);
		    System.out.println(Thread.currentThread().getName() + " Thread is invoked after three second");
		 synchronized (obj) {
			obj.wait(3000);
			System.out.println(obj + " Object is in waiting state and invoked after 3 seconds");
		}
	}

}


