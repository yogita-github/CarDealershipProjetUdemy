package car_dealership;

public class Customer {
	
	private String name;
	private String address;
	private double cashOnHand;
	
	
	
	public Customer(String name, String address, double cashOnHand) {
		super();
		this.name = name;
		this.address = address;
		this.cashOnHand = cashOnHand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getCashOnHand() {
		return cashOnHand;
	}

	public void setCashOnHand(double cashOnHand) {
		this.cashOnHand = cashOnHand;
	}

	public void purchaseCar(Vehicle vehicle,Employee emp,boolean finance) {
		emp.handleCustomer(this, finance, vehicle);
	}

}
