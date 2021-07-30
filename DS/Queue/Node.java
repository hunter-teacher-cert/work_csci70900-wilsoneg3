import java.io.*;
import java.util.*;

public class Node {

  private String name;
  private Node next;

  public Node() {
    name = "";
    next = null;
  }//default constructor declaring node
//you use this node to add node values
  public Node(String value) {

    name = value;
    next = null;
  }//constructor(vale) declaring node
  /
  //us/ e this one to add value and point to the next node
  public Node(String value, Node next) {
    name = value;
    this.next = next;
  }//constructor(value, next) declaring node

  public void setData(String value) {
    name = value;
  }//setData, assign string val (apply data to node)

  public void setNext(Node n) {
    next = n;
  }//setNext, sets pointer

  public String getValue() {
    return name;
  }//end getValue, returns the value of the string

  public Node getNext() {
    return next;
  }//getNext

  public String toString() {
    return name;
  }//toString

}//class Node