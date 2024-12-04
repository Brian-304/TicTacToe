package Game;

import java.util.ArrayList;
import java.util.List;


public class Cell {
	private List<List<Character>> cell;
	
	
	
	public Cell() {
		cell = new ArrayList<>();
		initializeBoard();
	}
	
	public void initializeBoard() {
		char num = '1';
		for(int i = 0; i < 3; i++) {
			List<Character> row = new ArrayList<>();
			for(int j = 0; j < 3; j++) {
				row.add(num++);
			}
			cell.add(row);
		}
	}
	
	public void displayBoard() {
		for(List<Character> row : cell) {
			for(Character ch : row) {
				System.out.print(ch + " ");
			}
			System.out.println();
		}
	}
	
}
