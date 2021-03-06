import java.io.*;
import java.util.*;


public class Driver {
    public static void main(String[] args) {
    	BSTree t = new BSTree();
      //seed the starting tree
       t.seed();
       System.out.println(t.search(8));
       System.out.println(t.search(13));

  /*
  t.search();
  int value;

  //search for items
  
  value = t.search(10);
  System.out.println(value);

  System.out.println(15);
  System.out.println(value);

  System.out.println(17);
  System.out.println(value);
  */

    t.insert(10);
    t.insert(20);
    t.insert(5);
    t.insert(7);
    t.insert(8);
    t.insert(3); 
    t.insert(25); 

    t.preorderTraverse();
    t.postorderTraverse();
    t.inorderTraverse();


    }
}