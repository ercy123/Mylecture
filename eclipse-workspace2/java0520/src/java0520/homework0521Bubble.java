package java0520;

import java.util.Scanner;

public class homework0521Bubble {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int arr1[] = new int[11];
		for(int a=1;a<arr1.length;a++)
		{
			System.out.println("숫자 입력");
			arr1[a]=sc.nextInt();
			System.out.println(a+"/10");
		}
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				if(arr1[j]<arr1[j+1])
				{
					int temp = arr1[j];
					arr1[j]=arr1[j+1];
					arr1[j+1]=temp;
							
				}
			}
		}
		for(int b=1;b<arr1.length;b++)
		{
			System.out.println(arr1[b]);
		}
		
	}

}