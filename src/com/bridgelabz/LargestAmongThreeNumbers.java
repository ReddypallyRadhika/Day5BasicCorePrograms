/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class LargestAmongThreeNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		System.out.println("Enter Number1 :");
        Scanner input = new Scanner(System.in);
        int n1 = input.nextInt();
        System.out.println("Enter Number2 :");
        Scanner input1 = new Scanner(System.in);
        int n2 = input1.nextInt();
        System.out.println("Enter Number3 :");
        Scanner input2 = new Scanner(System.in);
        int n3 = input2.nextInt();
        if(n1>n2&&n1>n3)
        {
        	System.out.println(n1+ " is greater");
        }
        else if(n2>n3&&n2>n1)
        {
        	System.out.println(n2+ " is greater");
        }
        else
        {
        	System.out.println(n3+ " is greater");
        }
	}

}
