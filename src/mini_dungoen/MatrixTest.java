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
    Matrix<Integer> matrix1 = new Matrix<Integer>(3, 3);
    Matrix<String> matrix2 = new Matrix<String>(2, 3);
  }
  
  @Test
  public void testAddItemWithInt() {
    Matrix<Integer> matrix1 = new Matrix<Integer>(3, 3);
    matrix1.setItem(5, 2, 2);
    assertEquals(matrix1.getItem(2,2),Integer.valueOf(5)); 
    matrix1.setItem(4, 0, 2);
    assertEquals(matrix1.getItem(0,2),Integer.valueOf(4)); 
  }
   
  @Test
  public void testAddItemWithString() {
    Matrix<String> matrix2 = new Matrix<String>(2, 3);
    matrix2.setItem("D", 1, 1);
    assertEquals(matrix2.getItem(1,1), "D");
    matrix2.setItem("A", 0, 1);
    assertEquals(matrix2.getItem(0,1), "A");
    matrix2.setItem("f", 1, 0);
    assertEquals(matrix2.getItem(1,0), "f");
  }
  
}
