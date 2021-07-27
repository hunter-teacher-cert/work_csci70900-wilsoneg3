import java.io.*;
import java.util.*;

// each half has a balanced branch
public class BSTree {
    private TreeNode root;

    public BSTree(){
	    root = null;
    }

  public void seed(){
	TreeNode t;
  //the root is 10
	t = new TreeNode(10);
	root = t;
  //left side is 5
	t = new TreeNode(5);
	root.setLeft(t);
  //right side is 20
	t = new TreeNode(20);
	root.setRight(t);
//left and right side each have a node of 8? or just the left?
/*
	root.getLeft().setRight( new TreeNode(8));

	t = new TreeNode(15);
	root.getRight().setLeft(t);

	t = new TreeNode(22);
	root.getRight().setRight(t);
  }
*/
  }
  //search 
  public int search(int key){
     TreeNode current = root;

    while (current != null){
      int currentValue = current.getData();
      if (key==currentValue){
        return key;
      } else if (key < currentValue){
        current = current.getLeft();
      } else {
        current = current.getRight();
    }
	}
  throw new NullPointerException();
    
}
/* work w mamudu
public int insert(int key){
     TreeNode n = TreeNode (key);
     TreeNode current = root;
     TreeNode previous = root;

    while (current != null){
      int currentData = current.getData();
      if (currentData==key){
        return key;
    } else if (currentData < key){
        previous = current;
        
    } else {
        current = current.getRight();
    }
	}
  throw new NullPointerException();
*/

// traverse tree to print out every node
private void traverse (TreeNode *current){
  if (current == null)
    return;

  // process the current node
  System.out.print(current.getData()+", ");
  // recursively print out left subtree
  traverse(current.getLeft());
  // recursively print out the right subtree
  traverse(current.getRight());
}

public void traverse(){
  traverse(root);
  }
}

// code along insert w video from Z
public int insert (int key){
  TreeNode newNode = new TreeNode(key);
  // if tree is empty
  // manually insert new node as root
  if (root==null){
    root = newNode;
    return;
  }
  TreeNode front = root; 
  TreeNode trailer = root;

  while (front != null){
    int frontValue=front.getData();
    if (frontValue == key){
      // if we are here it means the key is
      // already in the tree so we can
      // update this node in some way
      // and then return
      return;
    } else if (frontValue < key){
      trailer = front;
      front = front.getRight();
    } else {
      trailer = front;
      front = front.getLeft();
    }
}
if (key > trailer.getData()){
  //insert on getRight
  trailer.setRight(newNode);
} else {
  // insert on left
  trailer.setLeft(newNode);
}
}
}
