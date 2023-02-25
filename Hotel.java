package com.Swiggy;

public class Hotel {

	String food;
	double price;
	int quantity = 1;
	Hotel[] list;
	
	public void printmenu() {
		if(list instanceof Veg[]) {
			System.out.println("this is veg hotel");
		}else {
			System.out.println("this is non veg hotel");
		}
		System.err.println("please press 4 to add items");
		
//		for(int i = 0;i<list.length;i++) {
//			System.out.print(list[i].food+" ");
//			System.out.print(list[i].price);
//			System.out.println();
//		}
	}

}
