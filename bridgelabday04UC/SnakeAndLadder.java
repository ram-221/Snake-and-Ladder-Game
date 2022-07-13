package com.bridgelabday04UC;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int LADDER = 1;
		final int SNAKE = 2;
		int dieRoll = 0;
		int playerCurrentPosition = 0;
		while( playerCurrentPosition < 100) 
		{
			
			dieRoll++;
			int dice = (int)((Math.random()*10) % 6)+1;
			System.out.println("random number is:" +dice);   
			int position  = (int)((Math.random()*10) % 3);
			System.out.println("Position Number is:"+position);
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
			System.out.println("Number of time die to win the game :" + dieRoll);
		}
		
	}

}
