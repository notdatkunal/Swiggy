package com.Swiggy;

public class Veg extends Hotel{
	
	
	public Veg() {}
	public Veg(String add){
		list = new Veg[3];
		for(int i = 0;i<list.length;i++) {
			list[i]=new Veg();
		}
		list[0].food="Naan";
		list[0].price = 15;
		list[1].food="roti";
		list[1].price = 10;
		list[2].food="paneer butter masala";
		list[2].price = 150;
		super.printmenu();
	}
}
