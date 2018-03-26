public class Node {

  private boolean hasJump;
  private int value;
  private int x;
  private int y;

  public boolean isHasJump() {
    return hasJump;
  }

  public Node setHasJump(boolean hasJump) {
    this.hasJump = hasJump;
    return this;
  }

  public int getValue() {
    return value;
  }

  public Node setValue(int value) {
    this.value = value;
    return this;
  }

  public int getX() {
    return x;
  }

  public Node setX(int x) {
    this.x = x;
    return this;
  }

  public int getY() {
    return y;
  }

  public Node setY(int y) {
    this.y = y;
    return this;
  }

  @Override
  public String toString() {
    return "Node{" + "value=" + value + '}';
  }
}
