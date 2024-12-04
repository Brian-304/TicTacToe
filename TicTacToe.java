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
	}

	public static void main(String[] args) {
		
		System.out.println("Welcome To Tic-Tac-Toe \n");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name for Player 1: ");
		String player1Name = scanner.nextLine();
		System.out.println("Enter symbol for Player 1: ");
		char player1Symbol = scanner.next().charAt(0);
		
		Player player1 = new Player(player1Name, player1Symbol);
		
		System.out.println("Enter name for Player 2: ");
		scanner.nextLine();
		String player2Name = scanner.nextLine();
		System.out.println("Enter symbol for Player 2: ");
		char player2Symbol = scanner.next().charAt(0);
		
		
		Player player2 = new Player(player2Name, player2Symbol);
		
		System.out.println("Player 1: " + player1.getName() + " with symbol " + player1.getSymbol()); 
		System.out.println("Player 2: " + player2.getName() + " with symbol " + player2.getSymbol());
		
		TicTacToe game = new TicTacToe("Player 1", 'X', "Player 2", 'O');
		game.startGame();
		
		
	
	}
	

	}


