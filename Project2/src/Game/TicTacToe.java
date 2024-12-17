// David 
// Final Project
// 24FA-CS212-1

package Game;
import java.util.Scanner;

public class TicTacToe {
	
	private Player player1;
	private Player player2;
	private Cell board;
	
	public TicTacToe(String player1Name, char player1Symbol, String player2Name, char player2Symbol) {
		
		player1 = new Player(player1Name, player1Symbol);
		player2 = new Player(player2Name, player2Symbol);
		board = new Cell();
	}
	
	public void startGame() {
		board.displayBoard();
		TurnManager turnManager = new TurnManager();
		GameChecker gameChecker = new GameChecker();
		boolean gameEnded = false;
		
		while (!gameEnded){
			turnManager.playerTurn(player1, board);
			if (gameChecker.checkWinner(player1, board) || gameChecker.checkDraw(board)) {
				gameEnded = true;
				break;
			}
			
			turnManager.playerTurn(player2, board);
			if (gameChecker.checkWinner(player2, board) || gameChecker.checkDraw(board)) {
				gameEnded = true;
				break;
			}
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome To Tic-Tac-Toe \n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name for Player 1: ");
		String player1Name = scanner.nextLine();
		System.out.println("Enter symbol for Player 1: ");
		char player1Symbol = scanner.next().charAt(0);
		
		
		
		System.out.println("Enter name for Player 2: ");
		scanner.nextLine();
		String player2Name = scanner.nextLine();
		System.out.println("Enter symbol for Player 2: ");
		char player2Symbol = scanner.next().charAt(0);
		
		TicTacToe game = new TicTacToe(player1Name, player1Symbol, player2Name, player2Symbol);
		System.out.println("Player 1: " + game.player1.getName() + " with symbol " + game.player1.getSymbol());
		System.out.println("Player 2: " + game.player2.getName() + " with symbol " + game.player2.getSymbol());
		game.startGame();
		
	}
	
}


