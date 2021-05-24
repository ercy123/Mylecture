package java0520;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Practice {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		String num1=sc.nextLine();
		String[] num1Parse=num1.split(",");
//		int num4 = Integer.parseInt(num3);
//		System.out.println(num1Parse);
		
//		Integer.parseInt(num1Parse[0]);		
			
		int big = Integer.parseInt(num1Parse[0]);
		
		for(int i=0;i<num1Parse.length;i++)
		{

			if (big<Integer.parseInt(num1Parse[i]))
			{
				big=Integer.parseInt(num1Parse[i]);
				
			}
			
			
		}
		System.out.println(big);
		
		
//		int num[] = new int[10];
		
		
		
	}

}
