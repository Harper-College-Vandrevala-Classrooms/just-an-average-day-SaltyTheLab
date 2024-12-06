package com.csc;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestCalculator {
  int[] numbersloop = { 7, 1, 3, 0, 4, 6, 8, 5, 9, 2 };
  List<Integer> numbersstream = Arrays.asList(4, 7, 6, 2, 1, 3, 8, 9, 0, 5);
  Calculator calculator;

  @BeforeEach
  void setUp() {
    calculator = new Calculator();
  }

  @Test
  void sumtest() {
    assertEquals(45, calculator.sumfor(numbersloop));
  }

  @Test
  void avgtest() {
    assertEquals(4, calculator.averagefor(numbersloop));
  }

  @Test
  void maxfor() {
    assertEquals(9, calculator.maximunfor(numbersloop));
  }

  @Test
  void minfor() {
    assertEquals(0, calculator.minimumfor(numbersloop));
  }

  @Test
  void sumstream() {
    assertEquals(45, calculator.sumstream(numbersstream));
  }

  @Test
  void minstream() {
    assertEquals(0, calculator.minstream(numbersstream));
  }

  @Test
  void maxstream() {
    assertEquals(9, calculator.maxstream(numbersstream));
  }

  @Test
  void avgstream() {
    assertEquals(4, calculator.avgstream(numbersstream));
  }
}
