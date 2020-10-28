package Ex3;

public class ShippingPrice extends Order {
	
	public ShippingPrice() {
		
		price = quanOrdered * 100;
		
	}
	
	public ShippingPrice(String cName, String cNum, int q) {
		
		customerName = cName;
		cNum = cName;
		quanOrdered = q;
		price = quanOrdered * 100;
		
	}
	
	public double computePrice() {
		
		price += 0.75;
		return price;
		
	}
}
