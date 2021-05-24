package java0524ClassPractice;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		Student students[] = new Student[10];
		
		int engSum=0;
		int mathSum=0;		
		int sciSum=0;
		int count=1;
		
		for(int k=0;k<students.length;k++)
		{
			students[k] = new Student();
		}

		


		for(int j=0;j<10;j++)
		{
			System.out.println("학년/주소/영어/수학/과학");
			
			String[] str = sc.nextLine().split("/");		
			
			if(str[1].equals("sum"))
			{

				
				for(int i=0;i<str.length;i++)
				{
					engSum+=students[i].scores[0].score;
					mathSum+=students[i].scores[1].score;
					sciSum+=students[i].scores[2].score;
				}
				System.out.println("영어: " + engSum / (count-1));
				System.out.println("수학: " + mathSum / (count-1));
				System.out.println("과학: " + sciSum / (count-1));
				break;
			}
			
			students[j].grade = Integer.parseInt(str[0]);
			students[j].address = str[1];
			
			students[j].scores[0] = new Score();
			students[j].scores[0].score = Integer.parseInt(str[2]);
			students[j].scores[1] = new Score();
			students[j].scores[1].score = Integer.parseInt(str[3]);

			students[j].scores[2] = new Score();
			students[j].scores[2].score = Integer.parseInt(str[4]);
 			System.out.println(count + " /10");
			count++;

			
		}
		

		
	}

}
