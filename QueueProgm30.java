package Assistedpracticeproject;
import java.util.*;

public class QueueProgm30 {



public static void main(String[] args) 
{
        		Queue<String> locationsQueue = new LinkedList<>();
locationsQueue.add("ramnager");
        		locationsQueue.add("hyd");
        		locationsQueue.add("lbnager");
        		locationsQueue.add("kondapur");
        		locationsQueue.add("kompally");
System.out.println("Queue is : " + locationsQueue);
        		System.out.println("Head of Queue : " + locationsQueue.peek());
        		locationsQueue.remove();
        		System.out.println("After removing Head of Queue : " + locationsQueue);
        		System.out.println("Size of Queue : " + locationsQueue.size());
    	}
}



