package it.unibo.oop.lab05.ex4;

import java.util.Set;
import java.util.TreeSet;

import it.unibo.oop.lab05.ex3.Product;
import it.unibo.oop.lab05.ex3.WarehouseImpl;

/**
*
*/
public class OrderedWarehouse extends WarehouseImpl{	
	
	public Set<Product> allProduct() {
		Set<Product> set = new TreeSet<Product>(super.allProducts());
		return set;
	}

}
