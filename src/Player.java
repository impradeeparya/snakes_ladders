import java.util.function.BiConsumer;

public class Player {
  private int x;
  private int y;
  private Direction direction;
  private String name;

  public Player(int x, int y, Direction direction, String name) {
    this.x = x;
    this.y = y;
    this.direction = direction;
    this.name = name;
  }

  public BiConsumer<Board, Integer> move = (board, steps) -> {

    Node[][] matrix = board.matrix.get();

    if (this.x == matrix.length - 1 && this.y == 0) {
      steps--;
    }
    int m = matrix[0].length - 1;

    if (direction == Direction.RIGHT) {

      if (this.y + steps <= m) {
        this.y = this.y + steps;
      } else {
        int diff = this.y + steps - m;
        this.y = m;
        this.x--;
        this.direction = Direction.LEFT;
        this.y = this.y - diff;
      }

    } else {
      if (this.y - steps >= 0) {
        this.y = this.y - steps;
      } else {
        if (this.x - 1 >= 0) {
          int diff = Math.abs(this.y - steps);
          this.y = 0;
          this.x--;
          this.direction = Direction.RIGHT;
          this.y = diff;
        } else {
          System.out.println(name + " can't move, required : " + this.y);
        }
      }
    }
    System.out.println(name + " at " + board.value.apply(this.x, this.y) + " moving " + direction);

  };

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }

  @Override
  public String toString() {
    return "Player{" + "x=" + x + ", y=" + y + '}';
  }
}
