package Assistedpracticeproject;


	interface DimondInterface1   
	{  
	public default void display()   
	{  
	System.out.println("the display() method of DimondInterface1 invoked");  
	}  
	}  
	interface DimondInterface2  
	{  
	public default void display()   
	{  
	System.out.println("the display() method of DimondInterface2  invoked");  
	}  
	}  
	public class Dimond20  implements DimondInterface1 ,DimondInterface2  
	{  
	public void display()   
	{  
		DimondInterface1.super.display();  
		DimondInterface2  .super.display();  
	}  
	public static void main(String args[])   
	{  
		Dimond20  obj = new Dimond20 ();  
	obj.display();  
	}  
	}

