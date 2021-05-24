package java0524;

import java.util.Scanner;

public class Morse {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("문자 입력");
		String morse = sc.nextLine();
		String morse2[] = new String[100];

		
		for(int i=0;i<morse.length();i++)
		{
			morse2[i] = morse.substring(i, i+1);
		}

		for(int j=0; j<morse.length();j++)
		{
		switch(morse2[j])
			{
				case "A" :			
					System.out.print(".-");
					break;
				case "B":						
					System.out.print("-...");
					break;
				case "C":						
					System.out.print("-.-.");
					break;
				case "D":						
					System.out.print("-..");
					break;
				case "E":						
					System.out.print(".");
					break;
				case "F":						
					System.out.print("..-.");
					break;
				case "G":						
					System.out.print("--.");
					break;
				case "H":						
					System.out.print("....");
					break;
				case "I":						
					System.out.print("..");
					break;
				case "J":						
					System.out.print(".---");
					break;
				case "K":						
					System.out.print("-.-");
					break;
				case "L":						
					System.out.print(".-..");
					break;
				case "M":						
					System.out.print("--");
					break;
				case "N":						
					System.out.print("-.");
					break;
				case "O":						
					System.out.print("---");
					break;
				case "P":						
					System.out.print(".--.");
					break;
				case "Q":						
					System.out.print("--.-");
					break;
				case "R":						
					System.out.print(".-.");
					break;
				case "S":						
					System.out.print("...");
					break;
				case "T":						
					System.out.print("-");
					break;
				case "U":						
					System.out.print("..-");
					break;
				case "V":						
					System.out.print("...-");
					break;
				case "W":						
					System.out.print(".--");
					break;
				case "X":						
					System.out.print("-..-");
					break;
				case "Y":						
					System.out.print("-.--");
					break;
				case "Z":						
					System.out.print("--..");
					break;					
					
				case "a" :			
					System.out.print(".-");
					break;
				case "b":						
					System.out.print("-...");
					break;
				case "c":						
					System.out.print("-.-.");
					break;
				case "d":						
					System.out.print("-..");
					break;
				case "e":						
					System.out.print(".");
					break;
				case "f":						
					System.out.print("..-.");
					break;
				case "g":						
					System.out.print("--.");
					break;
				case "h":						
					System.out.print("....");
					break;
				case "i":						
					System.out.print("..");
					break;
				case "j":						
					System.out.print(".---");
					break;
				case "k":						
					System.out.print("-.-");
					break;
				case "l":						
					System.out.print(".-..");
					break;
				case "m":						
					System.out.print("--");
					break;
				case "n":						
					System.out.print("-.");
					break;
				case "o":						
					System.out.print("---");
					break;
				case "p":						
					System.out.print(".--.");
					break;
				case "q":						
					System.out.print("--.-");
					break;
				case "r":						
					System.out.print(".-.");
					break;
				case "s":						
					System.out.print("...");
					break;
				case "t":						
					System.out.print("-");
					break;
				case "u":						
					System.out.print("..-");
					break;
				case "v":						
					System.out.print("...-");
					break;
				case "w":						
					System.out.print(".--");
					break;
				case "x":						
					System.out.print("-..-");
					break;
				case "y":						
					System.out.print("-.--");
					break;
				case "z":						
					System.out.print("--..");
					break;					

					
				
			}
			System.out.print(" ");
		}
		
	}

}