package com.company;


public class LongestIncreasingSubsequence {
  static int [] array1 = new int[]{10,9,2,5,3,7,101,18};

  public static void main(String[] args) {
    System.out.println(findIncSubseq(array1));
  }

  private static int findIncSubseq(int[] array) {
    int longestSubsequence = 1;
    int startIndex = 0;
    int incrementalCount = 1;
    while (startIndex< array.length) {
      for(int i=0; i< array.length-1;i++) {
        if(array[i+1] > array[i]) {
          incrementalCount++;
          continue;
        } else {
          if(incrementalCount > longestSubsequence) {
            longestSubsequence = incrementalCount;
          }
          startIndex++;
          incrementalCount = 1;
        }
      }
    }
    return longestSubsequence;
  }


}
