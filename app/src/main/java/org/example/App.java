package org.example;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    // Test your Factorizer class using a driver program here!
    Factorizer f = new Factorizer();

    ArrayList<Integer> last = f.primeFactors(9);
    for (int i = 0; i < last.size(); i++)
    {
      System.out.print(last.get(i));
      System.out.print(", ");
    }

    System.out.println("Done");
    System.out.println(last.size());
    
  }
}
