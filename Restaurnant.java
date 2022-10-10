package com.te.traininng;

import java.util.Scanner;

public class Restaurnant {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String food[] = { "", "1 :Butter chicken", "2 :Motton Biryani", "3 :Mutton kanti", "4 :chicken kabab",
				"5 :Dosa" };
		int[] price = { 0, 250, 150, 250, 60, 50 };
		for (int i = 1; i < food.length; i++) {
			System.out.println(food[i] + "   " + price[i]);
		}
		int bill = 0;
		System.out.println("your order please");

		while (true) {
			System.out.println("mention how many items you need: ");
			int n = sc.nextInt();
			int[] arr = new int[n];
			String[] str = new String[n];
			System.out.println("Enter the item numbers : ");
			for (int i = 0; i < n; i++) {
				int item = sc.nextInt();
				bill = bill + price[item];
				str[i] = food[item];
				arr[i] = price[item];
			}

			for (int i = 0; i < str.length; i++) {
				System.out.println(str[i] + "-->" + arr[i]);
			}

			System.out.println("you want more press : yes");
			String proceed = sc.next();
			if (proceed.equalsIgnoreCase("yes")) {
				continue;
			} else
				break;

		}
		System.out.println("Total amount payable: " + bill);
		System.out.println("!!! order successfull");

	}
}
