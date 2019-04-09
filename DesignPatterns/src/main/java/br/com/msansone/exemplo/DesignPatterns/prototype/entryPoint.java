package br.com.msansone.exemplo.DesignPatterns.prototype;

public class entryPoint {

	public static void main(String[] args) throws CloneNotSupportedException {

		BookShop bookShop = new BookShop();
		bookShop.setShopName("Marcios´bookstore");
		bookShop.loadData();
		
		BookShop bs = bookShop.clone();
		bs.setShopName("nova loja");

		bookShop.books.remove(0);
		
		
		System.out.println(bookShop.toString());
		System.out.println(bs);

	}

}
