package java0520;

import java.util.Scanner;

public class Array_Class_Practice {

	public static void main(String[] args) {
		
		double[] score = new double[] {85.6,79.5,83.1,80.0,78.2,75.0};
		System.out.println("¹Ý ÀÔ·Â: ");
		
		Scanner sc= new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();

		System.out.println(score[num1-1] + score[num2-1] );
	}

}
