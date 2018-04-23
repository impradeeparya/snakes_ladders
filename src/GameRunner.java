import java.util.Random;
import java.util.Scanner;

public class GameRunner {

  public static void main(String[] args) {

    Board board = BoardBuilder.instance.get().build.apply(10, 10);

    board.snakesLadders.apply(9, 1, 7, 2).snakesLadders.apply(2, 7, 8, 3);

    Player player1 = new Player(9, 0, Direction.RIGHT, "player1");
    Player player2 = new Player(9, 0, Direction.RIGHT, "player2");

    Scanner scanner = new Scanner(System.in);

    System.out.println("do you want to start game (1 : yes/ 0 : no): ");
    int resume = scanner.nextInt();
    boolean isPlayer1 = true;
    Random rand = new Random();


    while (resume == 1) {

      int diceNumber = rand.nextInt(6) + 1;
      System.out.println("Player" + (isPlayer1 ? 1 : 2) + " got : " + diceNumber);

      if (isPlayer1) {
        player1.move.accept(board, diceNumber);
        if (board.isGameOver.apply(player1)) {
          System.out.println("Player1 won");
          break;
        }
      } else {
        player2.move.accept(board, diceNumber);
        if (board.isGameOver.apply(player2)) {
          System.out.println("Player2 won");
          break;
        }
      }

      System.out.println("do you want to resume (1 : yes/ 0 : no): ");
      resume = scanner.nextInt();
      isPlayer1 = !isPlayer1;
    }

  }
}
