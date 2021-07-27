public void delete(int key){
  // find the note that we want to delete
  // and the node above it using piggybacking
  // if the tree is empty, nothing to delete
  if (root==null){
    return;
  }
  // manually insert the new node as the root