package java0521;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {

		Student[] students = new Student[10];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("성적 입력 : 이름/학년/주소/수학/과학/영어/국어");
		
		int count=1;
		for(int i =0; i<students.length; i++)
		{
			students[i] = new Student();
		}
		
		for(Student student : students)
		{
			String[] data = sc.nextLine().split("/");
			if(data[1].equals("sum"))
			{
				int mathSum=0;
				int sciSum=0;
				int engSum=0;
				int langSum=0;
				for(int i=0; i<count-1;i++)
				{
					
					mathSum+=students[i].ScrObj[0].score;
					sciSum+=students[i].ScrObj[1].score;
					engSum+=students[i].ScrObj[2].score;
					langSum+=students[i].ScrObj[3].score;					
				}
				System.out.println("수학: "+ mathSum + "/" + (mathSum/(count-1)));
				System.out.println("과학: "+ sciSum + "/" + (sciSum/(count-1)));
				System.out.println("영어: "+ engSum + "/" + (engSum/(count-1)));
				System.out.println("국어: "+ langSum + "/" + (langSum/(count-1)));
				break;
				
			}
			student.studentName = data[0];
			student.grade = Integer.parseInt(data[1]);
			student.address = data[2];
			
			student.ScrObj[0] = new Score();
 			student.ScrObj[0].score=Integer.parseInt(data[3]);
			student.ScrObj[1] = new Score();
 			student.ScrObj[1].score=Integer.parseInt(data[4]);
			student.ScrObj[2] = new Score();
 			student.ScrObj[2].score=Integer.parseInt(data[5]);
			student.ScrObj[3] = new Score();
 			student.ScrObj[3].score=Integer.parseInt(data[6]);
 			
 			System.out.println(count + " /10");
 			count++;
		}
		
		
		
	}

}
