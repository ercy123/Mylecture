package java0520;

import java.util.Scanner;

public class Homework210520 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//자연수 n 입력 후 1부터 n까지 홀수를 더하고, 합계와 홀수갯수 출력
		System.out.println("숫자 입력");
		int num1 = sc.nextInt();
		int total=0;
		int count=0;
		for(int i=1;i<num1;i++)
		{
			if(i%2==0)
			{
				continue;
				
			}
			else
			{
				total+=i;
				count++;
			}
			
		}
		System.out.println("합계: "+ total+ " 홀수 갯수: "+ count);
		
		
	}

}
