package mini_dungoen;

public abstract class Unit {

  /** The row index of the unit. */
  private int rowIndex;
  /** The column index of the unit. */
  private int columnIndex;
  
  public Unit(int rowIndex, int columnIndex) {
    this.rowIndex = rowIndex;
    this.columnIndex = columnIndex;
  }
  
  public int getRowIndex() {
    return this.rowIndex;
  }
  
  public int getColumnIndex() {
    return this.columnIndex;
  }
  
  public void setRowIndex(int rowIndex) {
    this.rowIndex = rowIndex;
  }
  
  public void setColumnIndex(int columnIndex) {
    this.columnIndex = columnIndex;
  }
}
