package it.unibo.oop.lab05.ex3;

import java.util.Set;
import java.util.LinkedHashSet;

/**
 * Implementation of a warehouse.
 *
 */
public class WarehouseImpl implements Warehouse{
	private final Set<Product> products;
	
	public WarehouseImpl() {
		products = new LinkedHashSet<Product>();
	}
	
	public void addProduct(Product p) {
		products.add(p);
	}

	public Set<String> allNames() {
		Set<String> productsTmp = new LinkedHashSet<String>();
		for(final Product tmp : products) {
			productsTmp.add(tmp.getName());
		}
		return productsTmp;
	}

	public Set<Product> allProducts() {
		Set<Product> tmp = new LinkedHashSet<>();
		tmp.addAll(this.products);
		return this.products;
	}

	public boolean containsProduct(Product p) {
		return products.contains(p);
	}

	public double getQuantity(String name) {
		for(final Product tmp : products) {
			if(tmp.getName().equals(name)) {
				return tmp.getQuantity();
			}
		}
		return 0;
	}
}