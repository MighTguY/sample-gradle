package io.github.migthguy;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

  @Test
  public void testsortList() {
    int[] inputArr = {41, 12, 73, 4};
    Assert.assertEquals(new Integer(4), HelloWorld
        .sortList(Arrays.asList(Arrays.stream(inputArr).boxed().toArray(Integer[]::new))).get(0));
  }

}