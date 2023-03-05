package com.Basicprogram;

import java.util.Scanner;

public class ArmstrongNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number  ");
		int num = input.nextInt();
		int arm = 0, rem;
		int num1 = num;
		while (num > 0) {
			rem = num % 10;
			arm = arm + (rem * rem * rem);
			num = num / 10;
		}
		if (arm == num1) {
			System.out.println(arm + " " + "is a  armstrong number  ");
		} else {
			System.out.println(arm + " " + "is a not armstrong number  ");
		}

	}

}
