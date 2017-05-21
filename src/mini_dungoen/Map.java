package mini_dungoen;

/**
 * A Map
 * @author abelsang
 *
 */
public class Map {
  /** The 2D Matrix the map based on. */
  private Matrix matrix;
  /** The RPG role, hero. */
  private Hero hero;
 
  public Map(Matrix matrix) {
    this.matrix = matrix;
  }
  
  /**
   * Print the Map.
   */
  public void getMap() {
    int row = this.matrix.getLenRow();
    int col = this.matrix.getLenCol();
    for (int i=0;i< row;i++) {
      for (int j=0;j< col;j++) {
        int index = i * col + j;
        //System.out.print(index);
        System.out.print(this.matrix.getContainer()[index]);
      }
      System.out.print("\n");
    }
  }
  

}
