package java0520;

import java.util.Scanner;

public class Homework210520 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ڿ��� n �Է� �� 1���� n���� Ȧ���� ���ϰ�, �հ�� Ȧ������ ���
		System.out.println("���� �Է�");
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
		System.out.println("�հ�: "+ total+ " Ȧ�� ����: "+ count);
		
		
	}

}
