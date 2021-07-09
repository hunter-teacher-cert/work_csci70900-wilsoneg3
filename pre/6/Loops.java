import java.io.*;
import java.util.*;

/*Exercise 3  
In Exercise 9 we wrote a recursive version of power, which takes a double x and an integer n and returns xn. Now write an iterative method to perform the same calculation.

// declares 

RECURSIVE
public static double power(double x, int n) {
    if (n == 0)
        return 1;
    if (n == 1)
        return x;
    else
        return x * (power(x, n-1));

}
/*

/*iterative
2^3 = 8 (2*2*2)

}
*/
//ex 3
public class Loops{
  public static void main (String [] args){

  }
  public static double power(double x, int n)// sets method parameters as receiving a double x and an int n, and will perfrom power function with those inputs
  if (n==0){// sets condition of if n is zero
  return 1; // sets action if n is zero
  }
  else{
    for (int i = 1; i < n; i++){
      result =* i;
    }
    return result;
  }
  // ex 4
  public static int factorial (int num){
    // set case for number to 0 is 1
    if (num==0);
    return 1;
    // other number cases
    int factorial = 1;
    for (int i = 1; i <= num ; i++){
      factorial = factorial * i;
    }
    return factorial;


  }

  //ex 5... not really sure about this one 
}

