package br.com.msansone.exemplo.DesignPatterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {

	private String shopName;
	List<Book> books = new ArrayList<Book>();
	
	public String getShopName() {
		return shopName;
	}
	public void setShopName(String shopName) {
		this.shopName = shopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void loadData() {
		
		for(int i=0; i<=2;i++) {
			Book book = new Book();
			book.setId(i);
			book.setName("livro numero: "+i);
			this.books.add(book);
		}	
	}
	
	@Override
	public String toString() {
		return "BookShop [shopName=" + shopName + ", books=" + books + "]";
	}
	@Override
	protected BookShop clone() throws CloneNotSupportedException {
		
		BookShop bs = new BookShop();
		
		for(Book b : this.getBooks()) {
			bs.getBooks().add(b);
		}
		
		return bs;
		
	}
	
	
	
}
