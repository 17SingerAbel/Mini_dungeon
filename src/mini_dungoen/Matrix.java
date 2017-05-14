package mini_dungoen;

public class Matrix<T> {
  /** The length of the row in the matrix. */
  private final int lenRow;
  /** The lenght of the column in the matrix. */
  private final int lenCol;
  /** The total number of elements in the matrix. */
  private int size;
  /** The container contains Elements T. */
  private Object[] container;
   
  public Matrix(int row, int col) {
    // len is start at 1;
    if (row <= 0) {
      throw new IndexOutOfBoundsException( " Size of Row must be larger than 0 !!");
    }
    if (col <= 0) {
      throw new IndexOutOfBoundsException(" Size of Column must be larger than 0 !!");
    }
    this.lenRow = row;
    this.lenCol = col;
    this.size = lenRow * lenCol;
    this.container = new Object[size];
  }
 
  /**
   * Add an item T, at the specific location in matrix, into the container. 
   * Using 0 as the first index of row and column
   * @param item T.
   * @param rowIndex The index of row. (start from 0)
   * @param columnIndex The index of column. (start from 0)
   * @throws IndexOutOfBoundsException 
   */
  public void setItem(T item, int rowIndex, int columnIndex) throws IndexOutOfBoundsException {
    // len starts at 1, and always lenRow = row(max) + 1, lenCol = col(max) + 1;
    checkBoundary(rowIndex, columnIndex);
    int index = lenRow * rowIndex + columnIndex;
    this.container[index] = item;
  }
  
  /**
   * Get the item T at the specific location in matrix from the container.
   * Using 0 as the first index of row and column
   * @param rowIndex The index of row. (start from 0)
   * @param columnIndex The index of column. (start from 0)
   * @return T An item.
   * @throws IndexOutOfBoundsException
   */
  public T getItem(int rowIndex, int columnIndex) throws IndexOutOfBoundsException {
    // len starts at 1, and always lenRow = row(max) + 1, lenCol = col(max) + 1;
    checkBoundary(rowIndex, columnIndex);
    int index = rowIndex * lenRow + columnIndex;
    T result = (T) this.container[index];
    return result;
  }
  
  /**
   * Check the index is always less than the lenght of the row and column.
   * @param rowIndex The index of row, starts with 0.
   * @param columnIndex The index of column, starts with 0.
   */
  public void checkBoundary(int rowIndex, int columnIndex) {
    if ((rowIndex >= lenRow) || (rowIndex < 0)) {
      throw new IndexOutOfBoundsException(" rowIndex must be less than the length of Row !!");
    }
    if ((columnIndex >= lenCol) || (columnIndex < 0)) {
      throw new IndexOutOfBoundsException(" columnIndex must be less than the length of Column !!");
    }
  }
  
  public int getLenRow() {
    return this.lenRow;
  }
  
  public int getLenCol() {
    return this.lenCol;
  }
  
}
