package com.Swiggy;

public class Swiggy {

	Account a;
	Hotel b;
	Hotel[] order = new Hotel[0];
	double total = 0;
	public void login() {
		if(a!=null) {
			System.err.println("already logged in");
			return;
		}
		
		
	}
	public void logout() {
		
		if(a==null) {
			System.err.println("first login");
		}
		
		
	}
	private void addhotel() {
		if(b!=null) {
			System.out.println("hotel already added");
		}

	}
	
	private void OrderFood() {
		if(total==0) {}
		
		for(Hotel i:order) {
			total+=i.price;
		}


	}
	private void Cancelfood() {
		
		// TODO Auto-generated method stub

	}
	private void displayBill() {
		if(order.length==0) {
			return;
		}
		for(Hotel i:order) {
			total+=i.price;
		}


		
		System.out.println("your total is "+total);
		// TODO Auto-generated method stub

	}
	private void exit() {
		// TODO Auto-generated method stub

	}
	/*
	 * 
	 * login 
	 * logout
	 * add hotel 
	 * order food
	 * cancel food
	 * display bill
	 * exit
	 * */
}
