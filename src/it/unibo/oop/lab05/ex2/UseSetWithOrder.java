package it.unibo.oop.lab05.ex2;

import java.util.Set;
import java.util.TreeSet;

public final class UseSetWithOrder {
	private static final int NUM_STRINGS = 100;
	
    private UseSetWithOrder() {
    
    }
    
    public static void main(final String[] args) {
    	/*1) Creates a new ORDERED TreeSet of Strings. To order the set, define
             a new Comparator in a separate class.*/
    	Set<String> treeSet = new TreeSet<String>(new StringComparator());
    	
    	/* 2) Inserts in the set a hundred strings containing randomly generated
              numbers (use Math.random())*/
    	for(int i = 0; i < NUM_STRINGS; i++) {
    		treeSet.add(Double.toString(Math.random()));
    	}
    	
    	//3) Prints the set, which must be ordered
    	System.out.println(treeSet);
    }
}
