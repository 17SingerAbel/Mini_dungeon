package mini_dungoen;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TwoDinemMatrixTest {
   
  private TwoDinemMatrix<Integer> matrix1;
  private TwoDinemMatrix<String> matrix2;
  
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    System.out.println("setUpBeforeClass()");
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    System.out.println("tearDownAfterClass()");
  }

  @Before
  public void setUp() throws Exception {
    System.out.println("setUp()");
    testConstructor();
  }

  @After
  public void tearDown() throws Exception {
    System.out.println("tearDown()");
  }
  
  @Test
  public void testConstructor() {
    matrix1 = new TwoDinemMatrix(Integer.class, 3, 3);
    matrix1.addItem(1, 1, 1);
    matrix1.addItem(2, 1, 2);
    matrix1.addItem(3, 1, 3);
    matrix1.addItem(4, 2, 1);
    matrix2 = new TwoDinemMatrix(String.class, 2, 3);
    matrix2.addItem("A", 1, 1);
    matrix2.addItem("B", 1, 2);
    matrix2.addItem("C", 1, 3);
  }
  
  @Test
  public void testAddItem() {
    matrix1.addItem(5, 2, 2);
    //int index1 = 4;
    assertTrue(matrix1.getContainer()[4].equals(5)); 
    matrix2.addItem("D", 2, 1);
    //int index2 = 3;
    assertEquals(matrix2.getContainer()[3], "D");
  }
  
  @Test
  public void testGetItem() {
    int item1 = matrix1.getItem(1,3);
    assertEquals(item1 == 3, true);
    String item2 = matrix2.getItem(1, 2);
    assertEquals(item2.equals("B"), true);
  }
  
}
