package snakeLadder;

import java.util.Random;

public class SnakeAndLadder {
	
	int numberofPlayers = 1;
	public static final int startPosition = 0;	
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	public static final int winningPosition = 100;
	
	public static int playerRollsTheDie() {
		Random random = new Random();
		return random.nextInt(6)+1;
		}
	
	public static void checkForOption() {
		int playerPosition = startPosition;	
		int dieRolls = 0;
		while (playerPosition != winningPosition) {
			Random random = new Random();
			int option = random.nextInt(3);
			int diceValue = playerRollsTheDie();				
				System.out.println("Number on dice is: " + diceValue);
				System.out.println("player Position is "+ playerPosition);
				dieRolls += 1;
				
					switch (option) {
						case noPlay:
							System.out.println("its a foul so no changes in your position");
							playerPosition = playerPosition;							
							break;
						case ladder:
							System.out.println("Congrats!! you got a ladder");
							playerPosition = playerPosition + diceValue;	
								if (playerPosition > 100) {
									System.out.println("Oops!! greater then 100, Stay at your Position");
									playerPosition = playerPosition-diceValue;
								}
								if (playerPosition == 100) {	
									System.out.println(" ");
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
									System.out.println("!!Congrats You Won the Game!!");
									System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
								}
							break;
						case snake:
							System.out.println("Oops!! Snake bite go down");							
								if (playerPosition > diceValue ) {
									playerPosition = playerPosition - diceValue;	
								}
								else {
									playerPosition = 0;
								}						
							break;
						default:
							System.out.println("Invalid Option");
					}
			}	
		System.out.println("Die Rolled " + dieRolls + " times." );
	}
	
	
	public static void main(String[] args) {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("****Let's play Snake and Ladder Game*****");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(" ");
		checkForOption();
	}
	
}
