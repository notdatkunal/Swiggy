package com.Swiggy;

public class NonVeg extends Hotel{

	
	public NonVeg() {}
	public NonVeg(String add) {
		list = new NonVeg[6];
		for(int i = 0;i<list.length;i++) {
			list[i]=new NonVeg();
		}
		list[0].food="shwarma";
		list[0].price = 100;
		list[1].food="biryani h";
		list[1].price = 80;
		list[2].food="biryani f";
		list[2].price = 140;

		list[3].food="roti";
		list[3].price = 15;

		list[4].food="Chicken gravy";
		list[4].price = 100;

		list[5].food="Mutton gravy";
		list[5].price = 260;
		super.printmenu();
	}
}
