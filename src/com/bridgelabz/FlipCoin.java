/**
 * 
 */
package com.bridgelabz;

/**
 * @author hp
 *
 */
public class FlipCoin {

	/**
	 * @param args
	 */
	//Flip Coin
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flipcoin = (int) (Math.floor(Math.random()*10)%2);
		System.out.println(flipcoin);
		if(flipcoin<0.5)
		{
			System.out.println("Tails");
		}
		else
		{
			System.out.println("Heads");
		}
	}

}
