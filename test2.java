package com.Swiggy;

import java.io.File;

public class test2 {
	public static void main(String[] args) {
		File a = new File("hello.txt");
		System.out.println(a.exists());
		System.out.println(a.getAbsolutePath());
		System.out.println(a.getPath());
		File b = new File("src//com//Swiggy//login.txt");
		System.out.println(b.exists());
		System.out.println(b.getPath());
	}

}
