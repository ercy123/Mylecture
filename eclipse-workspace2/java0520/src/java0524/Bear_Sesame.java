package java0524;

import java.util.Scanner;

public class Bear_Sesame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("입력");
		String korean[] = {"곰돌이","복돌이","흰둥이","참깨","검둥이"};
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