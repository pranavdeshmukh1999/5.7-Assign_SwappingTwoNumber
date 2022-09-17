package com.blz.swapassign;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int num = 0;
		Scanner swap = new Scanner(System.in);
		System.out.println("Enter First Number :");

		int x = swap.nextInt();
		System.out.println("Enter Second Number :");

		int y = swap.nextInt();
		System.out.println("Original Number is = " + x + "" + y);
		num = x;
		x = y;
		y = num;
		System.out.println("Number After Swaping = " + x + "" + y);

		System.out.println("THIS IS SWAPING PROGRAM......THANK YOU");
	}
}