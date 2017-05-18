package mini_dungoen;

public class Creature extends Unit {
  /** The name of creature. */
  private String name;
  /** The hp of the creature. */
  private int hp;
  
  /**
   * A creature has name, hp, and location in the map.
   * @param name
   * @param hp
   * @param rowIndex
   * @param columnIndex
   */
  public Creature(String name, int hp, int rowIndex, int columnIndex) {
    super(rowIndex, columnIndex);
    this.name = name;
    this.hp = hp;
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
  
  public void setHp(int hp) {
    this.hp = hp;
  }
}
