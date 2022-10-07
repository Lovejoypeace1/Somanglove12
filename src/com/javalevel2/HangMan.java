package com.javalevel2;

import java.util.Scanner;

public class HangMan {

	public static void main(String[] args) {
		
		System.out.println(" Starting game");
		
		String notUsed = "abcdefghijklmnopqrstuvwxyz";
		
	String [] words = new String [] {"Computer","Mouse","Screen","Display","Language"};
	
	String randomWord = words [(int)(Math.random() * words.length)];
	
		System.out.println("The word has" +randomWord.length() +"letters.");
		
		char [] letters = new char [randomWord.length()];
		
		for (int i=0; i<letters.length; i++) {
			letters [i] = ".";
		}
		
		int lives =3;
		Scanner sc= new Scanner (System.in);
		while (lives > 0 ) {
			System.out.print("lives");
			
			for (int i=0; i <lives; i++) {
				System.out.print("0");
							}
			
			System.out.println();
			
			System.out.println("Input:");
			String input = sc.nextLine();
			char letter = input.charAt (0);
			
			boolean isGuessCorrect = false;
			
			for (int i=0; i<randomWord.length (); i++) {
				char l= randomWord.charAt(i);
				
				if (l == letter) {
					letters [i] =l;
					isGuessCorrect = true;
				}
			}
			if (!isGuessCorrect) {
				lives = lives-1;
			}
			
			boolean isGameFinished = true;
			System.out.println("Word:");
			
			for (int i=0; i<letters.length; i++) {
				if (letters[i] == ".") {
					isGameFinished = false;
				}
				
			System.out.print(letters[i]);
			}
			System.out.println();
			notUsed = notUsed.replace(letter, ".");
			System.out.println("Not used:" + notUsed);
			
			System.out.println("--------------");
			
			if(isGameFinished) {
				System.out.println("You Won!");
				break;
			}
		}
		if (lives == 0) {
			System.out.println("You Lost!The Word was:" +randomWord);
		}
		System.out.println("Exiting Game");
		}

}
