package java0517.CH3;

import java.util.Scanner;

public class homework0517_1_extra2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int inputA = scanner.nextInt();
		int inputB = scanner.nextInt();		
		System.out.println("Result1:" + (inputA+=100) + "   " + "Result2:" + (inputB%=10));		
	}

}
