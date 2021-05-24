package java0520;

import java.util.Scanner;

public class Homework210520_Matrix {
 
	public static void main(String[] args) {
	  // 숫자 매트릭스 출력	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		int num = sc.nextInt();
		

	
		

		int[] arr1 = new int[num*num];
		int[][] arr2 = new int[num][num];
		

		int ran1;
		
		for(int i=0;i<num;i++)
		{
			for(int j=0;j<num;j++)
			{
				while(true)
				{
					ran1 = ((int) (Math.random()*11) - 1);	
					if(ran1%2==1 && ran1>0)
					{
						break;
						
					}
				}
				
				arr2[i][j]=ran1;
				
			}
			
		}
		
		for(int z=0; z<num;z++)
		{
			for(int x=0; x<num;x++)
			{
				System.out.print(arr2[z][x]);
				System.out.print(" ");			
			}
			System.out.println();
			
		}
		
		
		
		
		
	}

}
