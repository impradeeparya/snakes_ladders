import java.util.function.BiFunction;

public class Board {

  private Node[][] matrix;

  public QuadFunction<Integer, Integer, Integer, Integer, Board> snakesLadders =
      (x1, y1, x2, y2) -> {
        if (matrix != null) {

          if (x1 <= matrix.length && y1 <= matrix[0].length) {
            Node node = matrix[x1][y1];
            node.setHasJump(true).setX(x2).setY(y2);
          }
        }

        return this;
      };

  public Board(Node[][] matrix) {
    this.matrix = matrix;
  }

  public BiFunction<Integer, Integer, Node> value = (x, y) -> {
    if (x <= matrix.length && y <= matrix[0].length) {
      return this.matrix[x][y];
    } else {
      return null;
    }
  };
}
