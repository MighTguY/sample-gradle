package io.github.migthguy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {

  public static List<Integer> sortList(List<Integer> dataInput) {
    Collections.sort(dataInput);
    return dataInput;
  }

  public static void main(String[] args) {
    int[] inputArr=  {41, 12, 73, 4};
    System.out.println("Hello World!");
    List<Integer> input = Arrays.asList(Arrays.stream(inputArr).boxed().toArray(Integer[]::new));
    System.out.println(sortList(input));
  }
}
