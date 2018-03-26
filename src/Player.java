import java.util.function.Consumer;

public class Player {
  private int x;
  private int y;
  private Direction direction;

  public Player(int x, int y, Direction direction) {
    this.x = x;
    this.y = y;
    this.direction = direction;
  }

  public int getX() {
    return x;
  }

  private Player setX(int x) {
    this.x = x;
    return this;
  }

  public int getY() {
    return y;
  }

  private Player setY(int y) {
    this.y = y;
    return this;
  }

  public Consumer<Board> move = (board) -> {
    Node[][] matrix = board.matrix.get();
  };

  @Override
  public String toString() {
    return "Player{" + "x=" + x + ", y=" + y + '}';
  }
}
