package mini_dungoen;

public class Simulation {
  
  public static void main(String[] agrs) {
    Matrix<String> matrix = new Matrix<String>(10, 15);
    matrix.buildWall();
    
    Map map = new Map(matrix);
    map.getMap();
  }
}
