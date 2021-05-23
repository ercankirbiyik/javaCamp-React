package caffeeShopDemo;

public class Product {
	
	private int id;
	private String Name;
	private double price;
	private boolean cofee;
	Product( String name, double price,boolean cofee) {
		super();
		this.id = -1;
		Name = name;
		this.price = price;
		this.cofee = cofee;
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isCofee() {
		return cofee;
	}
	public void setCofee(boolean cofee) {
		this.cofee = cofee;
	}
	

}
