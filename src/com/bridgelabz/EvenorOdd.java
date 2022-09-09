/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class EvenorOdd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int powerof2 
        System.out.println("Enter Number N :");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
      if(N%2==0)
      {
            System.out.println("Even"); 
      }
      else
      {
    	  System.out.println("Odd"); 
      }
	}

}
