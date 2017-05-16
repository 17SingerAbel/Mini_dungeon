package mini_dungoen;

public class Creature {
  /** The name of creature. */
  private String name;
  /** The hp of the creature. */
  private int hp;
  /** The row index of the creature. */
  private int rowIndex;
  /** The column index of the creature. */
  private int columnIndex;
  
  /**
   * A creature has name, hp, and location in the map.
   * @param name
   * @param hp
   * @param rowIndex
   * @param columnIndex
   */
  public Creature(String name, int hp, int rowIndex, int columnIndex) {
    this.name = name;
    this.hp = hp;
    this.rowIndex = rowIndex;
    this.columnIndex = columnIndex;
  }
  
  /**
   * The way a creature move.
   */
  public void move() {}
  
  public String getName() {
    return this.name;
  }
  
  public int getHp() {
    return this.hp;
  }
  
  public int getRowIndex() {
    return this.rowIndex;
  }
  
  public int getColumnIndex() {
    return this.columnIndex;
  }

}
