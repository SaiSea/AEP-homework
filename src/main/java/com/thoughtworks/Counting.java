package com.thoughtworks;

public class Counting {
  public String number(int num) {
    if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    }
    return "";
  }
}
