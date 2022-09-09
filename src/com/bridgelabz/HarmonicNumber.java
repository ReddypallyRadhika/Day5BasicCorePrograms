/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class HarmonicNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		double result=0.0;
	      System.out.println("Enter an number : ");
	      Scanner input = new Scanner(System.in);
	      n = input.nextInt();

	      for(i=n;i>0;i--)
	      {
	    	  result=result+(double)1/i;
	    	  System.out.println("Harmonic series is:"+result);
	    	 
	      }
	      double sum  = result;
	      System.out.println("Sum of Harmonic series is:"+sum);
	}

}
