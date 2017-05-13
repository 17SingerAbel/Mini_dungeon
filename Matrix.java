package mini_dungoen;

public class Matrix<T> {
  /** The length of the row in the matrix. */
  private int lenRow;
  /** The lenght of the column in the matrix. */
  private int lenCol;
  /** The total number of elements in the matrix. */
  private int size;
  /** The container contains Elements T. */
  private T[] container;
  //private int row = 0;
  //private int column = 0;
 
   
  @SuppressWarnings("unchecked")
  public Matrix(int lenRow, int lenCol) {
    // len is start at 1;
    if ((lenRow > 0) && (lenCol > 0)) {
      this.lenRow = lenRow;
      this.lenCol = lenCol;
      this.size = lenRow * lenCol;
      this.container = (T[]) new Object[size];
    } else {
      System.out.println(" Please use the Natural number !!!");
    }
  }
 
  /**
   * Add an item T, at the specific location in matrix, into the container. 
   * Using 0 as the first index of row and column
   * @param item T.
   * @param row The number of row.
   * @param column The number of column.
   * @throws LocationNotDefinedException 
   */
  public void setItem(T item, int row, int column) throws IndexOutOfBoundsException {
    // len starts at 1, and always lenRow = row(max) + 1, lenCol = col(max) + 1;
    if ((row < lenRow ) && (column < lenCol)) {
      int index = lenRow * row + column;
      this.container[index] = item;
    } else {
      throw new IndexOutOfBoundsException();
    }
  }
  
  /**
   * Get the item T at the specific location in matrix from the container.
   * Using 0 as the first index of row and column
   * @param row
   * @param column
   * @return
   * @throws LocationNotDefinedException
   */
  public T getItem(int row, int column) throws IndexOutOfBoundsException {
    // len starts at 1, and always lenRow = row(max) + 1, lenCol = col(max) + 1;
    if ((row < lenRow) && (column < lenCol)) {
      int index = lenRow * row + column;
      T result = this.container[index];
    return result;
    } else {
    throw new IndexOutOfBoundsException();
    }
  }
  
}
