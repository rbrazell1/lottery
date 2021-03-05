package edu.cnm.deepdive.exam1.prep;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class NumberBaseTest {

  static final int[] testCaseRadix = {

  };

  static final int[][] testCaseParams = {
      {0, 10},
      {1, 10},
      {9, 10},
      {16, 16},
      {15, 16}

  };

  static final String[] testCaseOutcome = {
      "0",
      "1",
      "9",
      "10",
      "F",

  };

  @Test
  void convertToBase() {
    for (int i = 0; i < testCaseParams.length ; i++) {
      String methOutcome = NumberBase.convertToBase(testCaseParams[i][0], testCaseParams[i][1]);
      assertLinesMatch(testCaseOutcome[i], methOutcome);
    }
  }

  private void assertLinesMatch(String s, String methOutcome) {
  }
}