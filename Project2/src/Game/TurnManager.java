package Game;

import java.util.Scanner;

public class TurnManager {
    private Scanner scanner = new Scanner(System.in);

    public void playerTurn(Player player, Cell board) {
        boolean validMove = false;

        while (!validMove) {
            System.out.println(player.getName() + "'s turn. Enter the position (1-9): ");
            int position;
            try {
                position = scanner.nextInt();
                int row = (position - 1) / 3;
                int col = (position - 1) % 3;
                validMove = board.makeMove(row, col, player.getSymbol());

                if (!validMove) {
                    System.out.println("Invalid move. Try again!");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a number between 1 and 9.");
                scanner.next(); // Clear invalid input
            }
        }
        board.displayBoard();
    }
}
