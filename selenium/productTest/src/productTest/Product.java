package productTest;

public class Product {

	public String name;
	public double price;
	public String skuId;
	
	public void purchase(int quantity) {
		System.out.println("purchase" + quantity);
	}
	
	public double calculatePrice(int quantity) {
		return (quantity*price);
	}
	
}
