//take list of non negative integers and print horizontal bars at each index
// print the value at each index
import java.io.*;
import java.util.*;

public class BarGraph {
  public static void main (String [] Args){
    int [] numbers = {1,2,34,15,8};
    for (int i = 0; i < numbers.length; i++){
      System.out.print(i + ": ");
      for (int j = 0; j < numbers[i]; j++){
        System.out.print("=");
      }
      System.out.println();
    }
  }
}