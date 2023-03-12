package com.Swiggy;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Swiggy {
	static Scanner sc = new Scanner(System.in);
	Account a;
	
	
	double total = 0;
	
	public void OrderFood() {
		
		displayBill();
		if(a==null) {
			System.err.println("please login");
			return;
		}
		if(a.b==null) {
			System.err.println("please add hotel");
			return;
		}
		if(total==0) {
			System.err.println("please order something");
			return;
		}
		if(a.order==null) {
			System.out.println("first order");
		}
		
		
		System.out.println("your order is on the way....");
		a.order = null;
		
		

// add one feature that can add items from the list
	}
	public void addFood() {
		
		if(a==null) {
			System.err.println("please login");
			return;
		}
		if(a.b==null) {
			System.err.println("please add hotel");
			return;
		}
		try {
		if(a.order.length==0) {
			System.err.println("you have empty basket");
		
		}else{
			System.out.println("your basket contains");
			for(Hotel a:a.order) {
				System.out.println(a.food+"\t"+a.price+"\t"+a.quantity);
				System.err.println("--------------");
			}
		}}catch(NullPointerException exception) {
			System.out.println("empty order");
			a.order = new Hotel[0];
		}
		
		System.out.println("choose your food you want to add");
		for(int i = 0;i<a.b.list.length;i++) {
			System.out.println((i+1)+"  "+a.b.list[i].food+" "+a.b.list[i].price);
		}
		System.err.println("press any other key to go back");
		int itemNo; 
		
		try{
			itemNo= sc.nextInt();
		}catch(Exception haha){
			String scr = sc.nextLine();
			System.out.println("going back ");
			return;
		}
		boolean cond = itemNo>0&&itemNo<=a.b.list.length;
		if(!cond) {
			System.out.println("wrong input");
			return;
		}
		if(check(itemNo)) {// make this method check the item from list if they already exit and 
			// return true if it's already there
			System.out.println("item is already added");
			System.out.println("do you want to add it again");
			System.out.println("1. yes | 2. no ");
			int c = sc.nextInt();
			switch (c) {
			case 1 -> addAgain(itemNo);
			case 2 -> System.out.println("okay"); 
			default -> System.out.println("choose proper option"); 
			
			}
			return;
		}
		System.out.println("add quantity");
		int q = sc.nextInt();
		if(q<1) {
			System.err.println("please provide a real number");
			return;
		}
//		b.list[itemNo-1].quantity=q;
//		switch(itemNo) {}
			a.order = addItem(a.order,a.b.list[itemNo-1]);
//			total +=q*b.list[itemNo-1].price;
			a.order[a.order.length-1].quantity=q;
			System.out.println("-------------------");
			System.out.println("Your item is added successfully");
			
			System.out.println("-------------------");
	}
	
	private void addAgain(int num) {
		// TODO Auto-generated method stub
		System.out.println("let's add it again"); 
		int i = 0;
		String s = a.b.list[num-1].food;
//		do {i++;}while(order[i].food!=b.list[num-1].food);
		for(Hotel j:a.order) {
			if(j.food==s) {
				
				break;
			}
			i++;
		}
		System.out.println("add quantity");
		int q = sc.nextInt();
		if(q<1) {
			System.err.println("please provide a real number");
			return;
		}
		a.order[i].quantity=q;
		
		
	}
	private boolean check(int No) {
		for(Hotel i:a.order) {
			if(a.b.list[No-1].food==i.food) {
				return true;
			}
		}
		// TODO Auto-generated method stub
		return false;
	}
	public Hotel[] addItem(Hotel[] order,Hotel item) {
		
		
		Hotel[] order1 = new Hotel[order.length +1];
		
		order1[order.length]=item;
		if(order.length!=0) {for (int i = 0; i < order1.length-1; i++) {
			order1[i]=order[i];
		}}
		return order1;

	}
	public void login() {
		if(a!=null) {
			System.err.println("already logged in");
			return;
		}
		System.out.println("enter username");
		String username = sc.next();
		System.out.println("enter password");
		int password;
		try {
			
			password= sc.nextInt();
		}catch(InputMismatchException w) {
			String str = sc.nextLine();
			System.err.println("wrong password combination");
			System.out.println("String: "+str.hashCode()+" cannot be a password");
			return;
		}
		System.out.println("enter your adress");
		String adress = sc.nextLine();
		adress = sc.nextLine();
		// this is one way to resolve the scanner bug that was not allocating the address value
		
		a = new Account(username,password,adress);
		
//		a.adress = ;
		System.out.println("account has been successfully created");
		// completed
	}
	public void logout() {
		
		if(a==null) {
			System.err.println("first login");
		}
		a = null;
		System.out.println("successfully logged out");
		//done
		
	}
	public void addhotel() {
		if(a==null) {
			
			System.err.println("login first");
			return;
		}
		if(a.b!=null) {
			System.err.println("hotel already added");
			return;
		}
		System.out.println("what would you prefer for meal ??");
		System.out.println("1. Veg			2. Non Veg");
		int i = sc.nextInt();
		switch(i) {
		case 1->	a.b = new Veg("hi");
		case 2 ->	a.b = new NonVeg("hi"); 
		default -> System.out.println("enter proper option");
						
					
		}
		
//done
	}
	

	public void Cancelfood() {
		if(a==null) {
			System.err.println("please login");
			return;
		}
		if(a.b==null) {
			System.err.println("please add hotel");
			return;
		}
		System.out.println("your order ");
		displayBill();
		if(total==0) {
			System.err.println("you have to order first");
			return;
		}
		a.order = null;
		total=0;
		System.out.println("your order is cancelled");
		
//done
	}
	public void displayBill() {
		
		try {
		if(a.order.length==0) {
			System.err.println("firs order something");
			return;
		}}
		catch(NullPointerException exception) {
			System.out.println("you have empty order");
			return;
		}
		for(Hotel i:a.order) {
			System.out.println("-----------------------------");
			double k =i.quantity*i.price; 
			total+=k;
			System.out.println(i.food+"  "+k);
		}		
		System.out.println("-----------------------------");
		System.out.println("your total is "+total);
		// done
	}
	public void exit() {
		System.out.println("Thank you for using Swiggy :)");
		System.exit(9);
		// done

	}
	public void removeHotel() {
		// TODO Auto-generated method stub
		if(a.b==null) {
			System.err.println("please add hotel first");
			return;
		}
		a.b=null;
	}
	
}
