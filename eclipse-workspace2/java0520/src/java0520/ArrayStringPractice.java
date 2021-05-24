package java0520;

import java.util.Scanner;

public class ArrayStringPractice {

	public static void main(String[] args) {
		
		char[] str1 = new char[]{'P','R','O','G','R','A','M','M','I','N','G'};
		
		Scanner sc = new Scanner(System.in);
		String char1 = sc.nextLine();

	
		
		
		
		switch(char1)
		{
			case "P":
			System.out.println("0");
			break;
			case "R":
			System.out.println("1");
			break;
			case "O":
			System.out.println("2");
			break;
			case "G":
			System.out.println("3");
			break;
			case "A":
			System.out.println("5");
			break;
			case "M":
			System.out.println("6");
			break;
			case "I":
			System.out.println("8");
			break;
			case "N":
			System.out.println("9");
			break;
			default:
			System.out.println("none");
			break;
			
		}
		
	}

}
