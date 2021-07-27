public int insert (int key){
  TreeNode newNode = new TreeNode(key);
  // if tree is empty
  // manually insert new node as root
  if (root==null){
    root = newNode;
    return;
  }


  TreeNode front = root; 
  TreeNode trailer;

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
if (key > front.getValue()){
  //insert on getRight
  front.setRight(newNode);
} else {
  // insert on left
  front.setLeft(newNode);
}
}