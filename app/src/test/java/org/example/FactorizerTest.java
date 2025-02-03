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
    assertEquals(first.size(), 0);

  }

  @Test
  void itReturnsAnEmptyListForOne()
  {
    ArrayList<Integer> second = factorizer.primeFactors(1);
    assertEquals(second.size(), 0);

  }

  ArrayList<Integer> t = factorizer.primeFactors(10);

  @Test
  void checkTenIndexZero()
  {
    assertEquals(t.get(0), 2);

  }

  @Test
  void checkTenIndexOne()
  {
    assertEquals(t.get(1), 5);
    
  }

  @Test
  void checkTenSize()
  {
    assertEquals(t.size(), 2);
    
  }

  ArrayList<Integer> oH = factorizer.primeFactors(100);

  @Test
  void check100Index0()
  {
    assertEquals(oH.get(0), 2);
    
  }

  @Test
  void check100Index1()
  {
    assertEquals(oH.get(1), 2);
    
  }

  @Test
  void check100Index2()
  {
    assertEquals(oH.get(2), 5);
    
  }

  @Test
  void check100Index3()
  {
    assertEquals(oH.get(3), 5);
    
  }

  @Test
  void check100Size()
  {
    assertEquals(oH.size(), 4);
    
  }


}
