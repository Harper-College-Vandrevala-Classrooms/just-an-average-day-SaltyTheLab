package com.csc;

import java.util.Arrays;
import java.util.List;

public class Calculator {
  public int minimumfor(int[] numbers) {
    int smallest = numbers[7];
    for (int x : numbers)
      if (x < smallest)
        smallest = x;
    return smallest;
  }

  public int maximunfor(int[] numbers) {
    int max = numbers[3];
    for (int x : numbers)
      if (x > max)
        max = x;
    return max;
  }

  public int averagefor(int[] numbers) {
    int total = 0;
    for (int x : numbers)
      total += x;
    total = total / numbers.length;
    return total;
  }

  public int sumfor(int[] numbers) {
    int sum = 0;
    for (int x : numbers)
      sum += x;
    return sum;
  }

  public Integer sumstream(List<Integer> numbers) {
    Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
    return sum;
  }

  public Integer avgstream(List<Integer> numbers) {
    Integer sum = numbers.stream().reduce(0, (a, b) -> a + b);
    Integer avg = sum / numbers.size();
    return avg;
  }

  public Integer minstream(List<Integer> numbers) {
    Integer min = numbers.stream().min(Integer::compare).get();
    return min;
  }

  public Integer maxstream(List<Integer> numbers) {
    Integer max = numbers.stream().max(Integer::compare).get();
    return max;
  }

  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    int[] numbersloop = { 7, 1, 3, 0, 4, 6, 8, 5, 9, 2 };
    List<Integer> numbersstream = Arrays.asList(7, 1, 3, 0, 4, 6, 8, 5, 9, 2);
    System.out.println(calculator.sumfor(numbersloop));
    System.out.println(calculator.minimumfor(numbersloop));
    System.out.println(calculator.maximunfor(numbersloop));
    System.out.println(calculator.averagefor(numbersloop));
    System.out.println(calculator.sumstream(numbersstream));
    System.out.println(calculator.minstream(numbersstream));
    System.out.println(calculator.maxstream(numbersstream));
    System.out.println(calculator.avgstream(numbersstream));

  }

}
