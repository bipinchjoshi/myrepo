package Visitor;

public class PriceVisitor implements Visitor {

	private double totalPrice;
	
	@Override
	public void visit(Book book) {
		totalPrice += book.getPrice();
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

	@Override
	public void visit(Pen pen) {
		totalPrice += pen.getPrice();		
	}

}
