package com.Swiggy;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class test {
//	static int b = 90;
//	static int i = 0 +b;
//	 switch (fruit) {
//   case "Mango" -> System.out.println("King of fruits");
//   case "Apple" -> System.out.println("A sweet red fruit");
//   case "Orange" -> System.out.println("Round fruit");
//   case "Grapes" -> System.out.println("Small fruit");
//   default -> System.out.println("please enter a valid fruit");
	// add one adress bar 
	// add one feature of quantity
	// and show all those items along with quanitity
	
	//int[] ARRAY = {1,2,3,4};
//	for(int a:array) {
//		System.out.println(a);
//	}
//}
	
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
	public static void main(String[] args) {
//		double d = 0.00;
//		System.out.println(i);
//		b = 9;
//		System.out.println(i);
		File f = new File("C:\\Users\\kunal\\MyWorkSpace\\SwiggyApp\\src\\com\\Swiggy\\login.txt");
		try {
			BufferedWriter w = new BufferedWriter(new FileWriter(f));
			w.write("hello file");
			w.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(f.exists());
		
	}
}
