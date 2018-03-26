public class Player {
  private int x;
  private int y;

  public int getX() {
    return x;
  }

  public Player setX(int x) {
    this.x = x;
    return this;
  }

  public int getY() {
    return y;
  }

  public Player setY(int y) {
    this.y = y;
    return this;
  }

  @Override
  public String toString() {
    return "Player{" + "x=" + x + ", y=" + y + '}';
  }
}
