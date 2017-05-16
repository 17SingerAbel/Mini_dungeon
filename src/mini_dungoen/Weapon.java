package mini_dungoen;

public class Weapon extends Item {
  /** The appearance of the weapon. */
  private String appearance;
  /** The attack the weapon has. */
  private int damage;
  /** The durablity of the weapon. The weapon cannot be used if durablity = 0. */
  private int durablity;
  /** The level hero can use the weapon. */
  private int levelLimit;
  
  /**
   * A weapon can be find on map or held by hero.
   * @param appearance The appearance of weapon. Maybe a gun or sward.
   * @param rowIndex The locaiton of the weapon.
   * @param columnIndex The location of the weapon.
   * @param damage The damage added to Hero.
   * @param durablity The durablity of usage.
   * @param levelLimit The level hero can use the weapon. 
   */
  public Weapon(String appearance, int rowIndex, int columnIndex, int damage, int durablity, int levelLimit) {
    super(rowIndex, columnIndex);
    this.appearance = appearance;
    this.damage = damage;
    this.durablity = durablity;
    this.levelLimit = levelLimit;
  }
  
  public int getDamage() {
    return this.damage;
  }
  
  public int getDurablity() {
    return this.durablity;
  }
  
  public int getLevelLimit() {
    return this.levelLimit;
  }


}
