import java.io.*;
import java.util.*;

public class Node {

  private String data;
  private Node next;

  public Node() {
    data = "";
    next = null;
  }//default constructor declaring node
//you use this node to add node values
  public Node(String value) {

    data = value;
    next = null;
  }//constructor(vale) declaring node
  //us/ e this one to add value and point to the next node
  public Node(String value, Node next) {
    data = value;
    this.next = next;
  }//constructor(value, next) declaring node

  public void setData(String value) {
    data = value;
  }//setData, assign string val (apply data to node)

  public void setNext(Node n) {
    next = n;
  }//setNext, sets pointer

  public String getData() {
    return data;
  }//end getValue, returns the value of the string

  public Node getNext() {
    return next;
  }//getNext

  public String toString() {
    return data;
  }//toString

}//class Node