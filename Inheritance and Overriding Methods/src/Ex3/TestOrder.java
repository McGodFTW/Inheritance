package Ex3;

public class TestOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Order o1 = new Order("Harish K", "6477821919", 7);
		ShippingPrice sp1 = new ShippingPrice("Shaquisha", "4162852145", 7);
		
		System.out.println("Name: " + o1.getCustomerName() + "\nCustomer's Number: " + o1.getCustomerNumber() + "\nQuantity: " + o1.getQuanOrdered() + "\nPrice: $" + o1.computePrice());
		System.out.println();
		System.out.println("Name: " + sp1.getCustomerName() + "\nCustomer's Number: " + sp1.getCustomerNumber() + "\nQuantity: " + sp1.getQuanOrdered() + "\nPrice: $" + sp1.computePrice());
	}

}
