package Visitor;

public class ShoppingCart {

	Visitable[] books = { new Pen(1.00), new Pen(1.5), new Book(2.50), new Book(5) };

	public double calculatePrice() {
		PriceVisitor priceVisitor = new PriceVisitor();
		for (Visitable item : books) {
			item.accept(priceVisitor);
		}

		return priceVisitor.getTotalPrice();
	}

	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();
		System.out.println("Your Bill :" +shoppingCart.calculatePrice());

	}

}
