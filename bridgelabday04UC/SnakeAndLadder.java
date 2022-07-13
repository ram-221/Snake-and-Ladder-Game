package com.bridgelabday04UC;

public class SnakeAndLadder {
	public static void main(String[] args) {

		System.out.println("Starting of Snake and Ladder Game");
		//System.out.println("start position "+ startPoint);

		final int LADDER = 1;
		final int SNAKE = 2;
		int playerCurrentPosition = 0;

		while( playerCurrentPosition< 100) 
		{
			int dice = (int)((Math.random()*10) % 6)+1;
			System.out.println("random number is:" +dice);   
			int position  = (int)((Math.random()*10) % 3);
			if(position == LADDER)
			{	
				playerCurrentPosition +=dice;
				if(playerCurrentPosition > 100)
					playerCurrentPosition -=dice;
				System.out.println("Ladder move forward "+ playerCurrentPosition);
			}
			else if(position == SNAKE)
			{	
				playerCurrentPosition -=dice;
				if(playerCurrentPosition < 0)
					playerCurrentPosition= 0;
				System.out.println("Snakes move backward "+ playerCurrentPosition);
			}
			else
			{
				System.out.println("Player are on "+ playerCurrentPosition);
			}

		}
	}

}
