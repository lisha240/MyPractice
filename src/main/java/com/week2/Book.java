package com.week2;

public class Book {

	
	  // use instance getter and setter public String tital; public Author author;
	 // public double price;
	 
	  public String getTital() { return tital; }
	  
	  public void setTital(String tital) { this.tital = tital; }
	  
	  @Override
	public String toString() {
		return "Book [tital=" + tital + ", author=" + author + ", price=" + price + ", getTital()=" + getTital()
				+ ", getAuthor()=" + getAuthor() + ", getPrice()=" + getPrice() + "]";
	}

	public Author getAuthor() { return author; }
	  
	  public void setAuthor(Author author) { this.author = author; }
	  
	  public double getPrice() { return price; }
	  
	 public void setPrice(double price) { this.price = price; }
	 

	// use parameterize constructor

	String tital;
	Author author;
	double price;

	Book(String title, String authorfirstname, String authorlastname, double price) {

		this.tital = title;
		this.author = new Author(authorfirstname, authorlastname);
		this.price = price;

	}

	void display() {
		System.out.println(tital + " " +author.getFirstname() + " " + author.getLastname()+" " +price);
	}

	public static void main(String[] args) {

		
		Book b2 = new Book("title", "authorfirstname", "authorlastname", 25);
		b2.display();

		/*
		 * Author a = new Author("jsk", "xdjo"); a.display();
		 */

	}

}
