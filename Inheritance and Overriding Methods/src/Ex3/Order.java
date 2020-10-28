package Ex3;

public class Order {
	
	String customerName, customerNumber;
	int quanOrdered;
	double price;
	
	public Order() {
		
		price = quanOrdered * 100;
		
	}
	
	public Order(String cName, String cNum, int q) {
		
		customerName = cName;
		cNum = cName;
		quanOrdered = q;
		price = quanOrdered * 100;
		
	}
	
	public void setCustomerName(String cName) {
		
		customerName = cName;
		
	}
	
	public void setCustomerNumber(String cNum) {
		
		customerNumber = cNum;
		
	}
	
	public void setQuanOrdered(int q) {
		
		quanOrdered = q;
		
	}
	
	public double computePrice() {
		
		price = quanOrdered * 100;
		return price;
		
	}
	
	public String getCustomerName() {
		
		return customerName;
		
	}
	
	public String getCustomerNumber() {
		
		return customerNumber;
		
	}
	
	public int getQuanOrdered() {
		
		return quanOrdered;
		
	}
	
	public double getPrice() {
		
		return price;
		
	}
	
	

}
