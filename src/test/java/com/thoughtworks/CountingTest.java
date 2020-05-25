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

  @Test
  public void should_say_FizzWhizz_when_counting_given_number_can_be_divided_by_3_and_7(){
    String result = counting.number(21);

    Assert.assertEquals(result, "FizzWhizz");
  }

  @Test
  public void should_say_BuzzWhizz_when_counting_given_number_can_be_divided_by_5_and_7(){
    String result = counting.number(35);

    Assert.assertEquals(result, "BuzzWhizz");
  }

  @Test
  public void should_say_FizzBuzzWhizz_when_counting_given_number_can_be_divided_by_3_5_and_7(){
    String result = counting.number(105);

    Assert.assertEquals(result, "FizzBuzzWhizz");
  }

  @Test
  public void should_say_the_value_of_num_when_counting_given_number_can_not_be_divided_by_3_5_and_7(){
    String result = counting.number(8);

    Assert.assertEquals(result, "8");
  }
}
