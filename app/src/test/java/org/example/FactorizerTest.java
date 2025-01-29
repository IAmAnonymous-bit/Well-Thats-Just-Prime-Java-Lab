package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class FactorizerTest {

  Factorizer factorizer;

  @BeforeEach
  void setUp()
  {
    factorizer = new Factorizer();

  }

  @Test
  void itReturnsAnEmptyListForZero() 
  {
    ArrayList<Integer> first = factorizer.primeFactors(0);
    assertEquals(0, first.size());

  }

  @Test
  void itReturnsAnEmptyListForOne()
  {
    ArrayList<Integer> second = factorizer.primeFactors(1);
    assertEquals(0, second.size());

  }

  ArrayList<Integer> f = factorizer.primeFactors(9);

  @Test
  void checkNineIndexZero()
  {
    assertEquals(cNIZ, f.get(0));

  }

  @Test
  void checkNineIndexOne()
  {
    assertEquals(3, f.get(1));
    
  }

  @Test
  void checkNineSize()
  {
    assertEquals(2, f.size());
    
  }
}
