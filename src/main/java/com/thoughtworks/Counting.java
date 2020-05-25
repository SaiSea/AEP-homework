package com.thoughtworks;

public class Counting {
  public String number(int num) {
    if (num % 105 == 0) {
      return "FizzBuzzWhizz";
    } else if (num % 35 == 0) {
      return "BuzzWhizz";
    } else if (num % 21 == 0) {
      return "FizzWhizz";
    } else if (num % 15 == 0) {
      return "FizzBuzz";
    } else if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else if (num % 7 == 0) {
      return "Whizz";
    }
    return "";
  }
}
