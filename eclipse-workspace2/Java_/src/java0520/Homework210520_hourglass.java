package java0520;

import java.util.Scanner;

public class Homework210520_hourglass {

	public static void main(String[] args) {

  // 숫자 입력후 모래시계형

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int i;
		int j;
		int k;
		for(i=0, j=0 ;i<((num1*2)-1);i++)
		{
			for(k=0; k<((num1*2)-1)-j;k++)
			{
				System.out.print((k < j) ? " " : "*" );
			}
			if(i<num1-1)
			{
				j++;
			}
			else
			{
				j--;
			}
			
			
				System.out.println("");
		}
	}

}
