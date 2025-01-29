package org.example;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    // Test your Factorizer class using a driver program here!
    Factorizer f = new Factorizer();

    ArrayList<Integer> check10 = f.primeFactors(10);
    for (int i = 0; i < check10.size(); i++)
    {
      System.out.print(check10.get(i));
      System.out.print(", ");
    }

    System.out.println("Done");
    System.out.println(check10.size());

    ArrayList<Integer> check100 = f.primeFactors(100);
    for (int i = 0; i < check100.size(); i++)
    {
      System.out.print(check100.get(i));
      System.out.print(", ");
    }

    System.out.println("Done");
    System.out.println(check100.size());
    
  }
}
