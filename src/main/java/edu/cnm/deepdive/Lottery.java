package edu.cnm.deepdive;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Random;

public class Lottery {

  public static void main(String[] args) {
    int poolSize = Integer.parseInt(args[0]);
    int drawSize = Integer.parseInt(args[1]);
    int countSize = Integer.parseInt(args[2]);
    int[] pool = getPool(poolSize);
    Random rng = new SecureRandom();
    Shuffler shuffler = new Shuffler(pool, rng);
    for (int i = 0; i < countSize; ++i) {
      int[] draw = shuffler.draw(drawSize);
      Arrays.sort(draw);
      System.out.println(Arrays.toString(draw));
    }
  }

  private static int[] getPool(int size) {
    int[] pool = new int[size];
    for (int i = 0; i < pool.length; ++i) {
      pool[i] = i + 1;
    }
    return pool;
  }

}
