// Application:     Program 3
// Name:            Colin Marinpetro
// GitHub User:     cmarinpetro
// Date:            Sep 29, 2022
// Version:         1.0
// Description:     Loops 

import java.util.Scanner;

public class MarinpetroProgram3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//start the scanner
		Scanner userScanner = new Scanner(System.in);
		
		//what is your name
		System.out.println("What's your name?");
		String name = userScanner.nextLine();
		
		//favorite number 0-100
		System.out.println("Pick a number between 0 and 100");
		int num = userScanner.nextInt();
		
		//while loop
		while(num<0 || num>100)
		{
			System.out.println("Pick a new number between 0 and 100");
			num = userScanner.nextInt();
		}
		
		
			
	}
	
	
	
	
	
		

	
	
}

