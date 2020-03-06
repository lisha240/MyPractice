package com.week2;

public class Author {
// this is use by constructor
	String Firstname;
	String Lastname;

	Author(String F, String L) {

		Firstname = F;
		Lastname = L;

	}
	
	

	public String getFirstname() {
		return Firstname;
	}



	public String getLastname() {
		return Lastname;
	}



	void display() {
		System.out.println(Firstname + " " + Lastname);
	}

	public static void main(String[] args) {
		Author a = new Author("LISHA", "PATEL");
		a.display();
	}
	// this is use by instance method; 
	/*
	 * public String Firstname; 
	 * public String Lastname;
	 * 
	 * public String getFirstname() { return Firstname; }
	 * 
	 * public void setFirstname(String firstname) { Firstname = firstname; }
	 * 
	 * public String getLastname() { return Lastname; }
	 * 
	 * public void setLastname(String lastname) { Lastname = lastname;
	 */
	//}

}
