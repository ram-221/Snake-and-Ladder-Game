package com.bridgelabday04UC;

public class SnakeAndLadder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int player1Position= 0;
		int player2Position= 0;
		int LADDER = 1;
		int SNAKE = 2;
        int dieRoll=0;
		while(player1Position < 100 && player2Position < 100) 
		{
			dieRoll++;

			int dice1 = (int)((Math.random()*10) % 6)+1;
			System.out.println("Player1 random number is:" +dice1);
			int dice2 = (int)((Math.random()*10) % 6)+1;
			System.out.println("Player2 random number is:" +dice2); 

			int position  = (int)((Math.random()*10) % 3);
			//System.out.println("")
			if(position == LADDER)
			{	
				player1Position += dice1;
				player2Position += dice2; 
				if(player1Position > 100 || player2Position > 100 ) 
				{	
					player1Position -=dice1;
					player2Position -=dice2;
				}
				System.out.println("player 1 move forward Because Ladder"+ player1Position);
				System.out.println("player 2 move forward Because Ladder"+ player2Position);

			}
			else if(position == SNAKE)
			{	
				player1Position -= dice1;
				player2Position -= dice2;
				if(player1Position < 0 || player2Position < 0 ) 
				{
					player1Position = 0;
					player2Position = 0;
				}
				System.out.println("player 1 move backward Because Snake:"+ player1Position);
				System.out.println("player 2 move backward Because Snake"+ player2Position);
			}
			else
			{
				System.out.println("Player 1 Position is:"+ player1Position);
				System.out.println("Player 2 Position is:"+ player2Position);
			}
			System.out.println("Number of time die to win the game" + dieRoll);
			if(player1Position == 100)
				System.out.println("Player 1 Win");	
			else  if(player2Position == 100)
				System.out.println("Player 2 Win");	

		}
	}

}
