/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class QuotientandRemainder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Dividend :");
        Scanner input = new Scanner(System.in);
        int dividend = input.nextInt();
        System.out.println("Enter Divisor :");
        int divisor =input.nextInt();
        int quotient =dividend/divisor;
        int remainder=	dividend%divisor;	
        System.out.println("The Quotient is:"+quotient);
        System.out.println("The Remainder is:"+remainder);
	}

}
