import java.io.*;
import java.util.*;

// each half has a balanced branch
public class BSTree {
    private TreeNode root;

    public BSTree(){
	    root = null;
    }

public void delete(int key){
  // find the note that we want to delete
  // and the node above it using piggybacking
  // if the tree is empty
  // manually insert the new node as the root
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
private void preorderTraverse(TreeNode *current){
  if (current == null)
    return;

  // process the current node
  System.out.print(current.getData()+", ");
  // recursively print out left subtree
  preorderTraverse(current.getLeft());
  // recursively print out the right subtree
  preorderTraverse(current.getRight());
}
public void preorderTraverse (){
  preorderTraverse(root);
  System.out.println();
}

private void postorderTraverse (TreeNode *current){
  if (current == null)
    return;

  // process the current node
  System.out.print(current.getData()+", ");
  // recursively print out left subtree
  postorderTraverse(current.getLeft());
  // recursively print out the right subtree
  postorderTraverse(current.getRight());
}

public void postorderTraverse(){
  postorderTraverse(root);
  System.out.println();
  }
}
private void inorderTraverse (TreeNode *current){
  if (current == null)
    return;

  // recursively print out left subtree
  inorderTraverse(current.getLeft());

  // process the current node
  System.out.print(current.getData()+", ");

  // recursively print out the right subtree
  traverse3(current.getRight());
}

public void inorderTraverse(){
  inorderTraverse(root);
  System.out.println();
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
  // do piggyback loop
  // until we either find the node or null
  // if the key isn't present

  while (front != null && front.getData() != key){
    if (front.getData() < key){
      trailer = front;
      front = front.getRight();
    } else 
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
// if key wasn't in the tree
if (front == null){
  return;
}
// if we get here
// front points to node we want to delete
// and trailer points to the one above it

// case 1-- node we want to delete is a leaf
if (front.getLeft() == null && front.getRight() == null) {
  // repoint front' sparent to null
} else if (true /*check to see if front has one child*/){
  //repoint front parent to front child
} else {
  // front has two children
  // 
  // find node w largest

}