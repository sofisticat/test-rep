package com.company;


public class SortStringWithoutBuiltInFunctions {

  public static void main(String[] args) {
    String sample1 = "cda";
    String sample2 = "dacb";
    String sample3 = "xakagofabcxabcm";
    char[] charArray = {'0', '1', '2', '0', '1', '2'};
    char[] charArray2 = {'5', '3','5','4','1', '2', '0', '1', '2','5'};
    char[] charArray3 = {'5', '3','5','4','1', '2', '0', '1', '2','0'};
    char[] charArray4 = {'5', '4','3','2','1', '0', '1', '2', '3','4','0','1','5','3','1','0','2','5'};
    char[] charArray5 = {'9','8','7','6','5','4','3','2','1','9','8','7','6','5','4','3','2','1','9','8','7','6','5','4','3','2','1'};
    System.out.println(sortChar(charArray));
    System.out.println(sortChar(charArray2));
    System.out.println(sortChar(charArray5));
    System.out.println(sortChar(charArray4));
    System.out.println(sortChar(charArray3));

    System.out.println(sortChar(sample1.toCharArray()));
    System.out.println(sortChar(sample2.toCharArray()));
    System.out.println(sortChar(sample3.toCharArray()));


    System.out.println(sortString(sample1.toCharArray()));
    System.out.println(sortString(sample2.toCharArray()));

  }
  // O(nlogn)
  public static String sortString(char[] charList) {
    if (charList.length < 1) {
      return "";
    }
    if (charList.length == 1) {
      return charList[0] + "";
    }
    char reference = charList[charList.length - 1];
    StringBuilder smaller = new StringBuilder();
    StringBuilder bigger = new StringBuilder();
    StringBuilder finalArray = new StringBuilder();
    for (char c : charList) {
      if (reference > c) {
        smaller.append(c);
      } else if (reference < c) {
        bigger.append(c);
      } else {
        finalArray
                .append(sortString(smaller.toString().toCharArray()))
                .append(reference)
                .append(sortString(bigger.toString().toCharArray()));
      }
//      3,5,7 | 2,3,11;
//      3,5,7,2,3,11;
//      3,5,7,2,3 | 11;

    }
    return finalArray.toString();
    // cda ->  a | cd
  }
  // O(2n^2)
  public static char[] sortChar(char[] charsToSort) {
//    new char[]{'0','1','2','0','1','2'}
    // low =0,mid=0, high=5
    // low=1,mid=1,high=5
    // low=1,mid=2,high=5
    // low=1,mid=2,high=4
    // low=1,mid=2,high=3
    // low=1,mid=2,high=3
    // low=1,mid=3,high=3
    // low=1,mid=3,high=3

    sortIt(charsToSort);
    sortIt(charsToSort);
    return charsToSort;
  }
  // O(2n^2)
  // O(n^2)
  private static void sortIt(char[] charsToSort) {
    for(int i=0; i< charsToSort.length; i++){
      int cursor = 0;
      char currentValue = charsToSort[i];
      for (int j = 0; j < charsToSort.length; j++) {
        char itValue = charsToSort[j];
        if (currentValue > itValue) {
          swapValues(charsToSort, cursor, j);
          cursor++;
        }
      }
    }
  }

  public static char[] swapValues(char[] value, int index1, int index2) {
    char temp = value[index1];
    value[index1] = value[index2];
    value[index2] = temp;
    return value;
  }
}
