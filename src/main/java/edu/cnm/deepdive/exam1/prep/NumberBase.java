package edu.cnm.deepdive.exam1.prep;


public class NumberBase {

  private static char[] digits = {
      '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',
      'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b',
      'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u',
      'v', 'w', 'x', 'y', 'z'
  };

  public NumberBase() {

  }

  public static String convertToBase(int value, int radix) {
    String rep = "";
    int n = Math.abs(value);
    while (n != 0) {
      int remainder = (int) (n % radix);
      rep = digits[remainder] + rep;
      n = n / radix;
    }

    return rep;
  }
}
