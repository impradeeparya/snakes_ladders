import java.util.function.BiFunction;
import java.util.function.Supplier;

public class BoardBuilder {

  private static BoardBuilder boardBuilder = new BoardBuilder();

  public BiFunction<Integer, Integer, Board> build = (r, c) -> {

    Node[][] matrix = new Node[r][c];

    int value = 1;
    for (int row = 0; row < r; row++)
      for (int col = 0; col < c; col++) {
        Node node = new Node();
        node.setValue(value++);
        matrix[row][col] = node;
      }


    return new Board(matrix);
  };

  public static Supplier<BoardBuilder> instance = () -> boardBuilder;

}
