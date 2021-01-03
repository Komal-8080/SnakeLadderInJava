package snakeLadder;

import java.util.Random;

public class SnakeAndLadder {
	
	int numberofPlayers = 1;
	public static final int startPosition = 0;	
	public static final int noPlay = 0;
	public static final int ladder = 1;
	public static final int snake = 2;
	
	public static int playerRollsTheDie() {
		Random random = new Random();
		return random.nextInt(6)+1;
		}
	
	public static void checkForOption() {
		int playerPosition = startPosition;
		Random random = new Random();
		int option = random.nextInt(3);
		int diceValue = playerRollsTheDie();
		switch (option) {
			case noPlay:
				playerPosition = playerPosition;
				System.out.println("its a foul so no changes in your position");
			break;
			case ladder:
				playerPosition = playerPosition + diceValue;
				System.out.println("Congrats!! you got a ladder");
			break;
			case snake:
				playerPosition = playerPosition - diceValue;
				System.out.println("Oops!! Snake bite go down");
			break;
			default:
				System.out.println("Invalid Option");
		}		
	}
	
	public static void main(String[] args) {		
		System.out.println("****Let's play Snake and Ladder Game*****");
		System.out.println("Number on dice is: " + playerRollsTheDie());
		checkForOption();
	}
	
}
