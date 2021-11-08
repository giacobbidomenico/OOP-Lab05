package it.unibo.oop.lab05.ex3;

/**
 * Product implementation.
 * 
 */
public class ProductImpl implements Product{
	private final String name;
	private final double quantity;
	
	/**
     * @param n
     *            the product name
     * @param q
     *            the product quantity
     */
	public ProductImpl(final String name,final double quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	
	public String getName() {
		return this.name;
	}

	public double getQuantity() {
		return this.quantity;
	}
	
	public int hashCode() {
		return this.name.hashCode();
	}
	
	public String toString() {
		return "("+ this.name +" , "+ this.quantity +")";
	}
	
	public boolean equals(final Object object) {
		if(object instanceof Product) {
			final var tmp = (Product) object;
			return this.name.equals(tmp.getName());
		}
		return false;
	}
}
