package Assistedpracticeproject;
import java.util.*;
import java.util.Map.Entry;


public class Map7 {
	
	

		public static void main(String[] args) {
			// map
			
			//Hashmap
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Nitheesh");    
		      hm.put(2,"Divya");    
		      hm.put(3,"Petter");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Entry<Integer, String> m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
		     //HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Ramu");  
		      ht.put(5,"Rosy");  
		      ht.put(6,"Gack");  
		      ht.put(7,"John");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Entry<Integer, String> n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
		      //TreeMap
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Amini");    
		      map.put(9,"Carlotte");    
		      map.put(10,"Cattor");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Entry<Integer, String> l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}


