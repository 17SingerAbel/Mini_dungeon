package mini_dungoen;

import java.util.ArrayList;

/** 
 * The hero.
 * @author abelsang
 *
 */
public class Hero extends Creature {
  /** The damge hero can attack. */
  private int attack;
  /** The weapon hero took. */
  private Weapon weapon;
  /** The movement speed. */
  private int speed;
  /** The buff hero has. */
  private ArrayList buffList;
  
  /**
   * The hero.
   * @param name The name.
   * @param hp The life hero has.
   * @param rowIndex The location of the row.
   * @param columnIndex The location of the column.
   */
  public Hero(String name, int hp, int rowIndex, int columnIndex) {
    super(name, hp, rowIndex, columnIndex);
    this.weapon = null;
    this.speed = 2;
    this.buffList = new ArrayList();

  }
  
  
}
