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

  ArrayList<Integer> t = factorizer.primeFactors(10);

  @Test
  void checkTenIndexZero()
  {
    assertEquals(2, t.get(0));

  }

  @Test
  void checkTenIndexOne()
  {
    assertEquals(5, t.get(1));
    
  }

  @Test
  void checkTenSize()
  {
    assertEquals(2, t.size());
    
  }

  ArrayList<Integer> oH = factorizer.primeFactors(100);

  @Test
  void check100Index0()
  {
    assertEquals(2, oH.get(0));
    
  }

  @Test
  void check100Index1()
  {
    assertEquals(2, oH.get(1));
    
  }

  @Test
  void check100Index2()
  {
    assertEquals(5, oH.get(2));
    
  }

  @Test
  void check100Index3()
  {
    assertEquals(5, oH.get(3));
    
  }

  @Test
  void check100Size()
  {
    assertEquals(4, oH.size());
    
  }


}
