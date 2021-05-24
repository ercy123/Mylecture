package java0520;

import java.util.Scanner;

public class PrimeNumber_Answer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("확인할 범위를 입력해주세요");
		int num=sc.nextInt();
	
		int i = 2;
		
		boolean isPrime = true;
		
		while (i<=num)
		{
			
			isPrime = true;
			
			for (int n =2 ; n< i ; n ++)
			{
				if (i %n ==0)
				{
					isPrime = false;
					
				}
				continue;
				
			}
			
			if (isPrime ==true) System.out.println(i);
			
			i++;	
		}
		
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

