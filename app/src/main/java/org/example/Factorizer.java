package org.example;

import java.util.ArrayList;

public class Factorizer {
  public ArrayList<Integer> primeFactors(Integer n) {
    // Implement your code here!
    int current = n.intValue();
    int testFactor = 2;
    ArrayList<Integer> factors = new ArrayList<Integer>();
    while (current != 1)
    {
      if(current % testFactor != 0)
      {
        testFactor++;
      } else {
        current = current / testFactor;
        factors.add(testFactor);
      }

    }

    return factors;
  }
}
