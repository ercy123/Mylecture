package java0520;

import java.util.Scanner;

public class ArrayReverse_Practice {

	public static void main(String[] args) {
		// ���� �������� �Է��� ���ڸ� �������� �籸��
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String[] str2 = str1.split(" ");
		for(int i=0;i<str2.length;i++)
		{
			System.out.print(str2[str2.length-i-1]);
			System.out.print(" ");
		}
	}

}