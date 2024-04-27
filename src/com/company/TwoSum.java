package com.company;

import java.util.HashMap;

public class TwoSum {
  public static void main(String[] args) {
    int[] input1 = new int[]{1,2,3,4,11,6};
    int target1 = 9;
    int[] input2 = new int[]{1,3,2,11,4,3,6};
    int target2 = 6;
    int[] input3 = new int[]{1,2,3,4,5,6};
    int target3 = 11;
    int[] input4 = new int[]{1,2,3,4,5,6};
    int target4 = 15;
    int[] input5 = new int[]{0,2,3,4,5,6};
    int target5 = 6;
    twoSum(input1, target1);
    twoSum(input2, target2);
    twoSum(input3, target3);
    twoSum(input4, target4);
    twoSum(input5, target5);
  }
  // complexity O(2N) ~= O(N)
  public static int[] twoSum(int[] listInteger, int target) {
    int[] solutions = new int[listInteger.length];
    HashMap<Integer, Integer> valueIndex = new HashMap<>();
    for(int indexItem=0; indexItem<listInteger.length; indexItem++) {
      int currentItem = listInteger[indexItem];
      int findValue= target-currentItem;
      solutions[indexItem] = findValue;
      valueIndex.put(currentItem,indexItem);
    }
    for(int i=0; i<solutions.length; i++) {
      int currentItem = solutions[i];
      if(target/2 == currentItem) {
        continue;
      }
      Integer index = valueIndex.get(currentItem);
      if(index != null) {
        int[] solution = new int[]{i, index} ;
        System.out.println("[" + i + ", " + index + "]");
        return solution;
      }

    }
    System.out.println("NO MATCH");
    return solutions;
  }
}
