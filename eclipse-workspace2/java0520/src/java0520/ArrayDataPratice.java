package java0520;

import java.util.Scanner;

public class ArrayDataPratice {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[100];
		int num1;

		int i;
		int j;
		int count=0;
		for(i=0;i<100;i++)
			{
				System.out.println("숫자 입력");
				num1=sc.nextInt();
//				int num2=Integer.parseInt(num1);				
				if(num1 ==-1)
				{
					i=99;
				}
				else			
				{	
					arr[i]=num1;
				}

			}

		
		
			for(j=0;j<100;j++)
			{
				if(arr[j]!=0)
				{
					System.out.println(arr[j]);
					count++;
	
				}
	
				if(count==3)
				{
					j=0;
				}
				
			}		


	

	}

}