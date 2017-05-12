package mini_dungoen;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TwoDinemMatrix<T> {
  /** The length of the row in the matrix. */
  private int len_row = 0;
  /** The lenght of the column in the matrix. */
  private int len_col = 0;
  /** The total number of elements in the matrix. */
  private int size = 0;
  /** The container contains Elements T. */
  private T[] container;
  //private int row = 0;
  //private int column = 0;
 
   
  @SuppressWarnings("unchecked")
  public TwoDinemMatrix(Class<T> clazz, int len_row, int len_col) {
    if ((len_row > 0) && (len_col > 0)) {
      this.len_row = len_row;
      this.len_col = len_col;
      this.size = len_row * len_col;
      this.container = (T[]) Array.newInstance(clazz, size);
    } 
  }
 
  /**
   * Add an item T, at the specific location in matrix, into the container. 
   * @param item T.
   * @param row The number of row.
   * @param column The number of column.
   */
  public void addItem(T item, int row, int column) {
    int index = len_row * (row-1) + column -1;
    this.container[index] = item;
  }
  
  /**
   * Get the item T at the specific location in matrix from the container.
   * @param row
   * @param column
   * @return
   */
  public T getItem(int row, int column) {
    int index = len_row * (row -1) + column - 1;
    T result = this.container[index];
    return result;
  }
  
  public T[] getContainer(){
    return this.container;
  }
  
  
  
}
