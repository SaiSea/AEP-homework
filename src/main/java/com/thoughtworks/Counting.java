package com.thoughtworks;

public class Counting {
  public String number(int num) {
    if (num % 3 == 0) {
      return "Fizz";
    } else if (num % 5 == 0) {
      return "Buzz";
    } else if (num % 7 == 0) {
      return "Whizz";
    }
    return "";
  }
}
