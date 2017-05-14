package mini_dungoen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MatrixTest {
  
  @Test
  public void testConstructor() {
    int row = 3;
    int col = 3;
    Matrix<Integer> matrix = new Matrix<Integer>(row, col);
    assertEquals(matrix.getLenCol(), 3);
    assertEquals(matrix.getLenRow(), 3);
  }
  
  @Test(expected = IndexOutOfBoundsException.class) 
  public void testConstructorWithZeroRow() {
    Matrix<String> matrix = new Matrix<String>(0, 3);
  }
  
  @Test(expected = IndexOutOfBoundsException.class) 
  public void testConstructorWithZeroColumn() {
    Matrix<String> matrix = new Matrix<String>(3, 0);
  }
  
  @Test
  public void testSetAndGetItemWithInt() {
    Matrix<Integer> matrix1 = new Matrix<Integer>(3, 3);
    matrix1.setItem(5, 2, 2);
    assertEquals(matrix1.getItem(2,2),Integer.valueOf(5)); 
    matrix1.setItem(4, 0, 2);
    assertEquals(matrix1.getItem(0,2),Integer.valueOf(4)); 
  }
   
  @Test
  public void testSetAndGetItemWithString() {
    Matrix<String> matrix2 = new Matrix<String>(2, 3);
    matrix2.setItem("D", 1, 1);
    assertEquals(matrix2.getItem(1,1), "D");
    matrix2.setItem("A", 0, 1);
    assertEquals(matrix2.getItem(0,1), "A");
    matrix2.setItem("f", 1, 0);
    assertEquals(matrix2.getItem(1,0), "f");
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void testSetAndGetItemWithLargerRowIndex() {
    Matrix<Integer> matrix1 = new Matrix<Integer>(3, 3);
    matrix1.setItem(3, 4, 2);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void testSetAndGetItemWithLargerColumnIndex() {
    Matrix<Integer> matrix1 = new Matrix<Integer>(4, 3);
    matrix1.setItem(333, 2, 4);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void testSetAndGetItemWithNegativeRowIndex() {
    Matrix<String> matrix2 = new Matrix<String>(3,5);
    matrix2.setItem("ASDF", -2, 3);
  }
  
  @Test(expected = IndexOutOfBoundsException.class)
  public void testSetAndGetItemWithNegativeColIndex() {
    Matrix<String> matrix2 = new Matrix<String>(3,5);
    matrix2.setItem("ASDF", 1, -4);
  }
  
}
