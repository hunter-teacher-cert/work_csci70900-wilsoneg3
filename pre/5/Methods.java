import java.io.*;
import java.util.*;

//ex 2
public class Methods {
  public static void main (String [] args){
  }
  //this method takes int n and int m and tells you if N is divisible by M by determining the remainder
    public static boolean isDivisible(int n, int m){
        if (n%m==0){
          return true;
    }
        else{
          return false;
        }
}
//ex 3
public boolean isTraingle(int a, int b, int c){
  // if side a is less than b+C, side b is less than b+C, and side c is less than b+a, then the inputs can form a triangle.
      if (a < (b+c) && b < (a+c) && c <(b+a)){
        return true;
      } else{
        return false;
      }
      }
}
//use recursion for implementing Ackermann function

//A(m,n)= n+1   if m=0
//=A(m-1,1)   if m>0, n=0
//=A(m-1, A(m,n01))
// if m>0 and n>0

//ex 8
int ack(int, int);
int main()
{
  int m,n;
  printf("Enter the value for m and n");
  scanf("%d %d", &m, &n);

  printf("The answer is %d", ack(m,n));

  return 0;
}
int ack (int m, int n)
{
  if (m==0)
    return (n+1);
    else if (m>0 && n==0)
    //calls itself for:
    return ack (m-1,1)
    else if (m>0 && n>0)
    //recursion
    return ack(m-1, ack(m,n-1))
}
}