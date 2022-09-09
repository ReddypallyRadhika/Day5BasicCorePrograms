/**
 * 
 */
package com.bridgelabz;

import java.util.Scanner;

/**
 * @author hp
 *
 */
public class SwapTwoNumbers {

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
        temp=n1;
        n1=n2;
        n2=temp;
        System.out.println("Number1 after swap:"+n1);
        System.out.println("Number2 after swap:"+n2);
	}

}
