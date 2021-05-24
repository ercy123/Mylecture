package java0520;

import java.util.Scanner;

public class PrimeNumber_Practice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		int count=0;
		int i=0;
		while (i<=num1)
		{
			for(int n=1; n<=i;n++ )
			{
				if(i%n == 0)
				{
	
					count++;					
					
					if(count==2)
					{				
						System.out.println(i);
					
					}
					continue;
					
					
				}					
				i++;
			}
		}
	}

}