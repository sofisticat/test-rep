package com.company;

import java.util.*;

public class RemoveDuplicatesFromArray {
  public static void main(String[] args) {
    int[] sample1 = new int[]{1,2,3,4,5,5,6,7,8,5,4,3,2,5,6,7,1,11,5};
    int[] sample2 = new int[]{9,7,6,3,3,5};
    removeDuplicates(sample1);
  }
  // set usage
  public static int[] removeDuplicates(int[] array) {
    int[] ints = Arrays.stream(array).distinct().toArray();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    for (int i :
            ints) {
      stringBuilder.append(i);
      stringBuilder.append(", ");
    }
    stringBuilder.delete(stringBuilder.length()-2,stringBuilder.length());
    stringBuilder.append("]");
    System.out.println(stringBuilder);
    return ints;
  }

}
