package it.unibo.oop.lab05.ex1;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;
/**
 * Example class using {@link Set}.
 * 
 */
public final class UseSet {
	private static int INIT_ELEMENT = 1;
	private static int INIT_EVEN_ELEMENT = 2;
	private static int LAST_ELEMENT = 20;
	
    private UseSet() {
    
    }

    private static boolean isDivisible(final int divident,final int divisor) {
    	return (divident % divisor) == 0;
    }
    
    /**
     * @param args
     *            ignored
     */
    public static void main(final String[] args) {
    	// 1) Builds a TreeSet containing Strings
    	final Set<String> treeSet1 = new TreeSet<String>();
    	
    	//2) Populates such Collection with all the Strings ranging from "1" to "20"
    	for(int i = INIT_ELEMENT; i < LAST_ELEMENT; i++) {
    		treeSet1.add(Integer.toString(i));
    	}
    	
    	//3) Prints its content
    	System.out.println("TreeSet:" + treeSet1);
    	
    	//4) Removes all those strings whose represented number is divisible by three
    	Iterator<String> iterator = treeSet1.iterator();
    	
    	while(iterator.hasNext()) {    		
    		if(isDivisible(Integer.parseInt(iterator.next()),3)) {
    			iterator.remove();
    		}
    	}
    	
    	//5) Prints the content of the Set using a for-each costruct
    	System.out.print("TreeSet:[");
    	for(final String app : treeSet1){
    		System.out.print(app + " ");
    	}
    	System.out.println("]");
    	
    	//6) Verifies if all the numbers left in the set are even
    	Set<String> treeSet2 = new TreeSet<String>();
    	for(int i = INIT_EVEN_ELEMENT; i <= LAST_ELEMENT; i += 2) {
    		treeSet2.add(Integer.toString(i));
    	}
    	System.out.println("All the numbers left in the set are even:"+ 
    			treeSet2.containsAll(treeSet1));
    }
}
