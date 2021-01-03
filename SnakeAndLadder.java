package snakeLadder;

import java.util.Random;

public class SnakeAndLadder {
	
	int startPosition = 0;
	int numberofPlayers = 1;
	
	public static int playerRollsTheDie() {
		Random numberOnDie = new Random();
		return numberOnDie.nextInt(6)+1;		
	}
	
	public static void main(String[] args) {
		
		System.out.println("****Let's play Snake and Ladder Game*****");
		System.out.println("Number on dice is: " + playerRollsTheDie());
	
	}

}
