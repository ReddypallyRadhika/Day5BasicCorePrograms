/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class Factors {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
	      System.out.println("Enter an number : ");
	      Scanner input = new Scanner(System.in);
	      n = input.nextInt();

	      for(i=1;i<n;i++)
	      {
	    	  if(n%i==0)
	    	  {
	    	  System.out.println(i);
	    	  }
	      }
	}

}
