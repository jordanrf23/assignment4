package game;

import java.util.Scanner;

import maze.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int size = 3 + (int)(Math.random() * 5);
		Grid grid = new Grid(size);
		Row agent = new Row(size -1, size -1);
		
		boolean playing = true;
		System.out.println("Now playing Tears, Despair, & Debugging");
		System.out.println();
		
		while(playing) {
			grid.printGrid(agent.getRow(), agent.getCol());
			System.out.println("Move using UP, DOWN, LEFT, RIGHT");
			String move = scanner.nextLine();
			playing = grid.moveAgent(move, agent);
		}
		
		System.out.println("Game over");

	}

}
