package com.Swiggy;

public class Hotel {

	String food;
	double price;
	
	Hotel[] list;
	
	public void printmenu() {
		if(list instanceof Veg[]) {
			System.out.println("this is veg menu");
		}else {
			System.out.println("this is non veg menu");
		}
		for(int i = 0;i<list.length;i++) {
			System.out.print(list[i].food+" ");
			System.out.print(list[i].price);
		}
	}

}
