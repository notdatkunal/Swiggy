package com.Swiggy;
import java.util.Scanner;
public class App {
	public static void main(String[] args) {
		System.out.println("welcome to swiggy");
		Swiggy A = new Swiggy();
		Scanner C = Swiggy.sc;
		while(true) {
			
			System.out.println("please choose the right option");
			System.out.println("1. login | 2. logout | 3. add hotel | 4. order food| 5. cancel food | 6. display bill | 7. addItem | 8. exit");
			int i = C.nextInt();
			switch(i) {
			case 1 ->A.login();
			case 2 ->A.logout();
			case 3 ->A.addhotel();
			case 4 ->A.OrderFood();
			case 5 ->A.Cancelfood();
			case 6 ->A.displayBill();
			case 7 ->A.addFood();
			case 8 ->A.exit();
			default->System.out.println("please choose the right option");
			}
			
			
			
		}
	}

}
