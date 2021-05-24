package java0520;

import java.util.Scanner;

public class Calculator_Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("계산식을 입력하세요");
		
		String str1 = sc.next();
		
		int strlen= str1.length();
		
//		System.out.println(strlen);

//		String[] str2 = str1.split("+");
		String[] str3 = str1.split("-");
//		String[] str4 = str1.split("*");		
//		String[] str5 = str1.split("/");
		System.out.println(str3[0]);
		
		int num1 = Integer.parseInt(str3[0]);
		int num2 = Integer.parseInt(str3[1]);

/*
		switch(str2[0])
		{
			case "+" : 
				System.out.println(num1+num2);
			break;
		
		
		}
*/		
		String strlen2 = (str3[0]+str3[1]);
		int parse2 = Integer.parseInt(strlen2);
		if(strlen != parse2)
		{
			System.out.println(num1-num2);
			
		}

		
		
		
/*		
		switch(str3[0])
		{
			case "-" : 
				System.out.println(num1-num2);
			break;
		
		
		}

		*/
		
/*		if(strlen == (strlen-1))
		{
			System.out.println(str2[0]+str2[1]);
			
		}
*/

				
		
	
			

	}

}
