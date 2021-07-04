import java.util.Scanner;
class Temp {
  
  public static void main(String[] args) {

  //import java.util.Scanner;
  double celsius;
  double farenheit;
  Scanner in = new Scanner(System.in); 
  System.out.print("What is the temp in c? ");
  celsius = in.nextInt(); 
  farenheit = (celsius * 9/5)+32;
  System.out.print(celsius + " celsius = ");
  System.out.println(farenheit + " farenheit"); 
    //System.out.println("Hello world!");
  }
}