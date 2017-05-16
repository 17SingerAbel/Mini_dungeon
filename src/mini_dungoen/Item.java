package mini_dungoen;

/**
 * An Item
 * @author abelsang
 *
 */
public class Item {
  /** The row index of the item. */
  private int rowIndex;
  /** The column index of the item. */
  private int columnIndex;
  
  public Item(int rowIndex, int columnIndex) {
    this.rowIndex = rowIndex;
    this.columnIndex = columnIndex;
  }
  
  public int getRowIndex() {
    return this.rowIndex;
  }
  
  public int getColumnIndex() {
    return this.columnIndex;
  }

}
