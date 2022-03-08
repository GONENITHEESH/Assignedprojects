package Assistedpracticeproject;

public class ExceptionHandiler17 {
	String getString(String s) {
		return s.concat("test"); 
	}

	    public static void main(String args[])
	    {
	    	ExceptionHandiler17 object = new ExceptionHandiler17();
	    	try {
	    		object.getString(null);

	    	}
	    	catch (Exception e) {
	    		System.out.println(e);
			}
	    	finally {
				System.out.println("Hello i am finally block i will be  execute");
			}

	     }
	  }



