// Jonathan, Brian 
// Final Project
// 24FA-CS212-1

package Game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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
	
	public boolean makeMove(int row, int col, char symbol) {
		if (cell.get(row).get(col) != 'X' && cell.get(row).get(col) != 'O') {
			cell.get(row).set(col, symbol);
			return true;
		}

		return false;
		
	}
	
	public boolean checkWin(char symbol) {
		for (int i = 0; i < 3; i++) {
			if (cell.get(i).get(0) == symbol && cell.get(i).get(1) == symbol && cell.get(i).get(2) == symbol)
				return true;
			if (cell.get(0).get(i) == symbol && cell.get(1).get(i) == symbol && cell.get(2).get(i) == symbol)
				return true;
		}
		
		if (cell.get(0).get(0) == symbol && cell.get(1).get(1) == symbol && cell.get(2).get(2) == symbol)
			return true;
		if (cell.get(0).get(2) == symbol && cell.get(1).get(1) == symbol && cell.get(2).get(0) == symbol)
			return true;
		
		return false;
	}
	
	public boolean isBoardFull() {
		for (List<Character> row : cell) {
			for (Character ch : row) {
				if (ch != 'X' && ch != 'O') {
					return false;
				}
			}
			
		}
		
		return true;
	}

}
