package java0520;

import java.util.Scanner;

public class MathClass_Power {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		int i;
		long total=0;
		for(i=1 ; i<=num1;i++)
		{
			
			total+=Math.pow(2*i, (2*i)-1);			
		}
		
		System.out.println(total);

		
//2,2 + 4,3 + 6,5 + 8,7

//2,1 + 4,3


		

	}

}
