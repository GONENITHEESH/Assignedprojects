package Assistedpracticeproject;

public class Program12  extends Thread {

		public void run() {
			for (int i = 0; i <= 10; i++) {
				System.out.println(i);
			}
			System.out.println("run method logic executed");
		}

		public static void main(String[] args) {
			Program12 threadObject = new Program12();
			threadObject.start();

		}
	}


