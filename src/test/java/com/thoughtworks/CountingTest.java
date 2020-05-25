package com.thoughtworks;

import org.junit.Assert;
import org.junit.Test;

public class CountingTest {
  private final Counting counting = new Counting();

  @Test
  public void should_say_Fizz_when_counting_given_number_can_be_divided_by_3(){
    String result = counting.number(3);

    Assert.assertEquals(result, "Fizz");
  }
}
