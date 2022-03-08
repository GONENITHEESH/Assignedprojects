package Assistedpracticeproject;


public class Sycnchronization14 
	 implements Runnable{

	       public static void main(String[] args) {
	    	   Sycnchronization14 object = new Sycnchronization14();
	        Thread threadObject = new Thread(object);
	        // without synchronization
	        threadObject.start();
	        // with synchronization
	        object.m1();

	    }
	    public void run() {
	    	System.out.println("Greetings for the newyear.");
	        System.out.println("hello..");
	        System.out.println("hi..");
	    }

	    public void m1() {
	    synchronized(this){
	    	for(int i=0;i<10;i++) {
	    		System.out.println(i);
	    	}

	    }
	    }


}


	 
	