package mini_dungoen;

public class Simulation {
  
  public static void main(String[] agrs) {
    System.out.println("\n");
    Matrix<String> matrix = new Matrix<String>(10, 15);
    matrix.buildWall();
    Map map = new Map(matrix);
    Hero hero = new Hero("Alex",10, 6, 6, matrix);
    map.addHero(hero);
    hero.moveUp();
    hero.moveRight();
    map.getMap();

  }
}
