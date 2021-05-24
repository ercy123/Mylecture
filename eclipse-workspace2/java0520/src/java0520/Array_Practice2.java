package java0520;

import java.util.Scanner;

public class Array_Practice2 {

	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		String num1=sc.nextLine();
		String[] num1Parse=num1.split(",");
		
		Integer.parseInt(num1Parse[0]);
		
//		String num2 = num1Parse.toString();
		
		
		int total = 0;
		for(int i=0;i<num1Parse.length;i++)
		{
			if(i%2==0)
			{
//				total=num1Parse[i]+total;
				
			}

		}
		
		
//		int num[] = new int[10];
		
		
		
	}

}
