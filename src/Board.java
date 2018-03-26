import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Board {

  private Node[][] board;

  public QuadFunction<Integer, Integer, Integer, Integer, Board> snakesLadders =
      (x1, y1, x2, y2) -> {
        if (board != null) {

          if (x1 <= board.length && y1 <= board[0].length) {
            Node node = board[x1][y1];
            node.setHasJump(true).setX(x2).setY(y2);
          }
        }

        return this;
      };

  public Board(Node[][] matrix) {
    this.board = matrix;
  }

  public BiFunction<Integer, Integer, Node> value = (x, y) -> {
    if (x <= board.length && y <= board[0].length) {
      return this.board[x][y];
    } else {
      return null;
    }
  };

  public Supplier<Node[][]> matrix = () -> board;
}
