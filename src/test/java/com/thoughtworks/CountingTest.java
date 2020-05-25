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

  @Test
  public void should_say_Buzz_when_counting_given_number_can_be_divided_by_5(){
    String result = counting.number(5);

    Assert.assertEquals(result, "Buzz");
  }

  @Test
  public void should_say_Whizz_when_counting_given_number_can_be_divided_by_7(){
    String result = counting.number(7);

    Assert.assertEquals(result, "Whizz");
  }

  @Test
  public void should_say_FizzBuzz_when_counting_given_number_can_be_divided_by_3_and_5(){
    String result = counting.number(15);

    Assert.assertEquals(result, "FizzBuzz");
  }
}
