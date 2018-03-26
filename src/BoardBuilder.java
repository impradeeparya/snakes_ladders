import java.util.function.BiFunction;
import java.util.function.Supplier;

public class BoardBuilder {

  private static BoardBuilder boardBuilder = new BoardBuilder();

  public BiFunction<Integer, Integer, Board> build = (r, c) -> {

    Node[][] matrix = new Node[r][c];

    int value = 100;
    int col = 0;
    boolean isRight = true;
    for (int row = 0; row < r; row++) {
      while (isRight ? (col < c) : (col >= 0)) {
        Node node = new Node();
        node.setValue(value--);
        matrix[row][col] = node;
        col = isRight ? ++col : --col;
      }
      isRight = !isRight;
      col = (col == c) ? --col : ++col;
    }


    return new Board(matrix);
  };

  public static Supplier<BoardBuilder> instance = () -> boardBuilder;

}
