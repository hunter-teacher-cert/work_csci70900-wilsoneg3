/*
Queue Folder: ds/queue
Create a class that represents a queue. This class should use a linked list that you build (not the built in Java class) with at least two pointers. Your class should implement the following methods:
constructor(s)
enqueue(value) <-- add value to the end of the queue
x = dequeue() <-- remove and return the value at the front of the queue
x = front() <-- return but don't remove the value at the front
isEmpty() <-- returns true if the queue is empty
size() <-- returns the number of items in the queue
worked with Stephannia
*/
import java.io.*;
import java.util.*;
//
public class Queue {
  private Node head;//remove from head
  private int count;
  private Node tail;// add things
  private String data;

  public Queue(){
    head=null;
    count=0;
    tail=null;
    data = "";
  }

  public boolean isEmpty(){
    if(head == null){
      return true;
    }else {
      return false;
    }

  }//end isEmpty

    //add  to the tail of ll
public void enqueue(String data){
  Node node = new Node(data);
  if (tail != null){
    tail.next = node;
  }
  tail = node;
  if (head == null){
    head = node;
  }
}// end of enqueu

  //remove and return the value at the front/head of the queue
  public void dequeue(){
    int data = head.data;
    //removes from queue
    head = head.next;
    if (head == null){
      tail = null;
    }
    return data;
  }//end of dequeue

public String front(){
    return head.getData();
  }//end front

public int size(){
    return count;
  }//end size

public String toString(){
    Node currentNode;
    currentNode = head;
    String result = "";
    while (currentNode != null){
      result = result + currentNode + " <- ";
      currentNode = currentNode.getNext();
    }
    result = result + "tail";
    return result;

  }
}
//https://www.youtube.com/watch?v=wjI1WNcIntg