/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class VowelorConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter letter  :");
        Scanner sc = new Scanner(System.in);
        char letters = sc.next().charAt(0);
		switch (letters)
		{
		case 'a':
		System.out.println("vowel");
		break;
		case 'e':
		System.out.println("vowel");
		break;
		case 'i':
		System.out.println("vowel");
		break;
		case 'o':
		System.out.println("vowel");
		break;
		case 'u':
		System.out.println("vowel");
		break;
		case 'A':
			System.out.println("vowel");
			//break;
			case 'E':
			System.out.println("vowel");
			break;
			case 'I':
			System.out.println("vowel");
			break;
			case 'O':
			System.out.println("vowel");
			break;
			case 'U':
			System.out.println("vowel");
			break;
		default:
			System.out.println("consonent");
		}
		
	}

}
