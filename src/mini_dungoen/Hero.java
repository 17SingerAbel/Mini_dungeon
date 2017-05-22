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
  private ArrayList<Buff> buffList;
  /** The appearance of the hero. */
  private String appearance;
  /** The direction of the movement. */
  private String direction;
  /** The maatrix contains the hero. */
  private Matrix matrix;
  /** The index of the hero. */
  private int heroIndex;
  
  /**
   * The hero.
   * @param name The name.
   * @param hp The life hero has.
   * @param rowIndex The location of the row.
   * @param columnIndex The location of the column.
   */
  public Hero(String name, int hp, int rowIndex, int columnIndex, Matrix matrix) {
    super(name, hp, rowIndex, columnIndex);
    this.attack = 10;
    this.weapon = null;
    this.speed = 2;
    this.buffList = new ArrayList<Buff>();
    this.appearance = "H*o";
    this.matrix = matrix;
    this.heroIndex = getHeroIndex(rowIndex, columnIndex);   
  }
  
  @Override
  public void move() {
    if (direction.equals("UP")) {
      moveUp();
    } else if (direction.equals("DOWN")) {
      moveDown();
    } else if (direction.equals("LEFT")) {
      moveLeft();
    }else if (direction.equals("RIGHT")) {
      moveRight();
    }   
  }
  
  public void moveUp() {
    int rowIndex = this.getRowIndex();
    int colIndex = this.getColumnIndex();
    int currIndex = getHeroIndex(rowIndex -1, colIndex);
    this.matrix.getContainer()[currIndex] = this.appearance;
    this.matrix.getContainer()[heroIndex] = "   ";
    this.heroIndex = currIndex;
  }
  public void moveDown() {
    
  }
  public void moveLeft() {
    
  }
  public void moveRight() {
    
  }
  
  public void addBuff() {
    
  }
  
  public void deleteBuff() {
    
  }
  
  public int getAttack() {
    return this.attack;
  }
  
  public void setAttack(int attack) {
    this.attack = attack;
  }
  
  public Weapon getWeapon() {
    return this.weapon;
  }
  
  public void setWeapon(Weapon weapon) {
    this.weapon = weapon;
  }
  
  public int getSpeed() {
    return this.speed;
  }
  
  public void setSpeed() {
    this.speed = speed;
  }
  
  public ArrayList<Buff> getBuffList() {
    return this.buffList;
  }
  public String getAppearance() {
    return this.appearance;
  }
  
  public int getHeroIndex(int rowIndex, int colIndex) {
    int index = rowIndex * this.matrix.getLenCol() + colIndex;
    return index;
  }
}
