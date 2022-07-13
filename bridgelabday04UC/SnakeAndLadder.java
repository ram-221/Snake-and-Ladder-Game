package com.bridgelabday04UC;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Starting of Snake and Ladder Game");
		final int NoPlay = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		//variables
		int dice = (int)((Math.random()*10) % 6);
		int position =(int)((Math.random()*10) %3 );
		int playerCurrentPosition = 0;
		switch(position)
		{
		case 0: 
			playerCurrentPosition= NoPlay;
			System.out.println("No Movement");
			break;
		case 1: 
			playerCurrentPosition = LADDER;
			playerCurrentPosition +=dice;
			System.out.println("Ladder move forward " + playerCurrentPosition);
			break;
		case 2:
			playerCurrentPosition =SNAKE ;
			playerCurrentPosition -=dice;
			System.out.println("Snakes move backward "+ playerCurrentPosition);
			break;
		default :
			playerCurrentPosition +=dice;
			System.out.println("Movement to " +playerCurrentPosition );
		}

	}

}
