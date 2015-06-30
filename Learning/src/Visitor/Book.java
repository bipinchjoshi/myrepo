package Visitor;

public class Book implements Visitable {

	private double price;
	private double weight;
	
	public Book(double price){
		this.price = price;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}

	public double getWeight() {
		return weight;
	}

	
}