package snakeLadder;

import java.util.ArrayList;
import java.util.Random;

public class SnakeAndLadder {
	
	public static final int startPosition=0;
	public static final int winningPosition=100;
	public static final int noPlay=1;
	public static final int snake=2;
	public static final int ladder=3;
		   
		
		   public static int playerRollsTheDie() {
			  int die = (int) ((Math.random() * 6 ) + 1 );
			  return die;
		   }

		   public static int checkForOption( int dieRoll,int playerPosition ) {
		      int option = (int) ((Math.random() *3) + 1); 
		      switch ( option )
		      {
		         case noPlay:
		        	 playerPosition = playerPosition;
		            break;
		         case snake:
		        	 playerPosition -= dieRoll;
		            break;
		         case ladder:
		            int dieRoll1 = playerRollsTheDie();
		            if(playerPosition+dieRoll > 100)
		            	playerPosition = playerPosition;
		            else
		            	playerPosition += dieRoll;
		                if(playerPosition+dieRoll1 > 100)
		                	playerPosition = playerPosition;
		                else
		                	playerPosition += dieRoll1;	               
		            break;
		      }
		      if(playerPosition < 0)
		    	  playerPosition = 0;
		      return playerPosition;
		   }
		   
		   public static void gameWithTwoPlayers() {	
			  int position = 0;	
			  int player1Position = 0;
			  int count = 0;
			  int player2Position = 0;
			  ArrayList<Integer> pos1 = new ArrayList<>();
			  ArrayList<Integer> pos2 = new ArrayList<>();
			  while (position < 100)
			  {
			    int dieRollA = playerRollsTheDie();
			    int dieRollB = playerRollsTheDie();
			    player1Position = checkForOption(dieRollA, player1Position);
			    player2Position = checkForOption(dieRollB,player2Position);
			    pos1.add(player1Position);
			    pos2.add(player2Position); 
				    if (player1Position > player2Position)
				        position = player1Position;
				    else
				    	position = player2Position;
				       count++;
				    }
				  if (player1Position > player2Position) {
					  System.out.println("~~~~~~~~~~~~~~~~~~");
					  System.out.println("Player 1 is winner");
					  System.out.println("~~~~~~~~~~~~~~~~~~");	
					  System.out.println(" ");
				  }			   
				  else {
					  System.out.println("~~~~~~~~~~~~~~~~~~");
					  System.out.println("Player 2 is winner");
					  System.out.println("~~~~~~~~~~~~~~~~~~");	
					  System.out.println(" ");
				  }
				  System.out.println("position of Player1:"+player1Position+"****position of Player2:"+player2Position);
				  System.out.println("number of times each player rolled die rolled:"+count);
				  System.out.println("position of Player1 after every roll:"+pos1);
			      System.out.println("position of Player2 after every roll:"+pos2);
		   }
		   
		   public static void main(String[] args)
		   {
			   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			   System.out.println("****Let's play Snake and Ladder Game*****");
			   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			   System.out.println(" ");
			   gameWithTwoPlayers();
		      
		   }
		
}