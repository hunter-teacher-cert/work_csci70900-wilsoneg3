import java.io.*;
import java.util.*;


public class Llist{
    private Node front; // the front of the list

    public  Llist(){
	front = null;
    }

    // Add a new node containing data
    // at the front of the list
    :32
public void addFront(String data){
  	   // make the new node
  	   Node n = new Node(data);
  	  // point it to what front points to
      n.setNext(front);
	  front =n;
    }// end add

	
    }

    public String toString(){
	Node currentNode;
	currentNode = front;
	String result = "";
	while (currentNode != null){
	    result = result + currentNode;
	    // this is like i=i+1 is for arrays
	    // but for linked lists 
	    currentNode = currentNode.getNext();
	}
	result = result + "null";
	return result;

    }
    
}