package com.Swiggy;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		System.out.println("welcome to swiggy");
		Swiggy A = new Swiggy();
		Scanner C = Swiggy.sc;
		System.out.println("please choose the following options");
		while(true) {
			
			System.out.println("1. login | 2. logout | 3. add hotel | 4. addItem| 5. cancel food | 6. display bill | 7. order food | 8. exit");
			int i = C.nextInt();
			switch(i) {
			case 1 ->A.login();
			case 2 ->A.logout();
			case 3 ->A.addhotel();
			case 4 ->A.addFood();
			case 5 ->A.Cancelfood();
			case 6 ->A.displayBill();
			case 7 ->A.OrderFood();
			case 8 ->A.exit();
			default->System.err.println("please choose the right option");
			}
			
			
			
		}
	}

}
