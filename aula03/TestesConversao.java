public class TestesConversao {
  public static void main(String[] args) {
    int myIntI = 9;
    double myDoubleI = myIntI; // Automatic casting: int to double

    System.out.println(myIntI);
    System.out.println(myDoubleI);

    double myDoubleII = 9.78d;
    int myIntII = (int) myDoubleII; // Explicit casting: double to int

    System.out.println(myDoubleII);
    System.out.println(myIntII);
  }
}


