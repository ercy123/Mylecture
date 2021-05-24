package java0524;

import java.util.Scanner;

public class Bear_Sesame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ÀÔ·Â");
		String korean[] = {"°õµ¹ÀÌ","º¹µ¹ÀÌ","ÈòµÕÀÌ","±ú¼Ò±İ","±î¸¸Äá"};
		String english[] = {"Bear","Gift","White","Sesame","Black"};
		
		String result = sc.nextLine();


		for(int i=0;i<korean.length;i++)
		{
			if(result.equals(korean[i]))
			{
				System.out.println(english[i]);
			}		
			
		}
		
	}

}