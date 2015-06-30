package Visitor;

public class Pen implements Visitable {

	private double price;
	
	public Pen(double price){
		this.price = price;
	}
	
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	public double getPrice() {
		return price;
	}


}
