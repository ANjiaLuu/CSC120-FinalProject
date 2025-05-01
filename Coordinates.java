public class Coordinates {
  public double x;
  public double y;

  public Coordinates(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "You're at (" + this.x + " , " + this.y + ")";
  }

  public boolean equals(Coordinates other) {
    return this.x == other.x && this.y == other.y;
  }
}
