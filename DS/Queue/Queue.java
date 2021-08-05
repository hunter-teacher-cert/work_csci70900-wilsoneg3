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
// default contsructor
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
    // this creates a new node for holding data val
  Node node = new Node(data);
  // if the tail is not null, add value to tail end of queue... if not, skip this step
  if (tail != null){
    tail.setNext(node);
  }
  tail = node;
  if (head == null){
    head = node;
  }
  count++;
}// end of enqueue

  //remove and return the value at the front/head of the queue
  public void dequeue(){
   // int data = head.data;
    //removes from queue
   // head = head.next;
   // if (head == null){
   //   tail = null;
   if(tail == null){
     System.out.println("The Queue is empty");
     count=0;
    }
    //return data;
    // if that staement is false, we change pionter so that head is null and tail is null
    else{
      head = head.getNext();
      if(head == null){
        tail = null;
        count--;
      }
    }
  }//end of dequeue
// return item at front

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
      // this is equivalent of i=i+1 for LL 
      currentNode = currentNode.getNext();
    }
    result = result + "tail";
    return result;

  }
}
//https://www.youtube.com/watch?v=wjI1WNcIntg