class Fib{
  public static int fibLoop (int n){
    if (n < 0){
      System.out.println("Only positive inputs please!");
    }
    if (n == 0){
      return 0;
    }
    if (n == 1){
      return 1;
    }
    if (n > 1){
      return (fibLoop(n-1) + fibLoop(n-2));
    }
    return 0;
  }//end of fibLoop
  
  public static void main(String[] args) {
      System.out.println("Hello world!");
      System.out.println(fibLoop(10));
    }//end main



    // result = fibLoop(n-1) + fibLoop(n-2);
    //  if (n = 0){
    //     result = 0;
    //  }
    //  result = (n-2) + (n-1);
    //  for(int i = 0 ; i < n; i++){
    //   // result = (i-1) + (i-2);
    //   // System.out.println("i is: " + i);
    //   //  System.out.println("result is: " + result);
    //     result = fibLoop(n-1) + fibLoop(n-2);
    //     System.out.println("The " + i + "th term in the series is: " + result);
    //   }
}//end of class