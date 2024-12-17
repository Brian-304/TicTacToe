// David
// Final Project
// 24FA-CS212-1

package Game;

public class GameChecker {
    public boolean checkWinner(Player player, Cell board) {
        if (board.checkWin(player.getSymbol())) {
            System.out.println(player.getName() + " wins!");
            return true;
        }
        return false;
    }

    public boolean checkDraw(Cell board) {
        if (board.isBoardFull()) {
            System.out.println("It's a draw!");
            return true;
        }
        return false;
    }
}
