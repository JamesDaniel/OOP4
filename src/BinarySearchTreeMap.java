
/**
   This class implements a Map based binary search tree whose
   nodes hold keys (of type K) that implement the Comparable
   interface and associated values (of type V).
*/

public class BinarySearchTreeMap<K extends Comparable<K>, V> {
   private Node root;
   private int size;

    public int size() {
        return this.size;
    }
   
   private class Node
   {
      public K key;
      public V val;
      public Node left;
      public Node right;
   }
   
   public BinarySearchTreeMap(){
     root = null;
     size = 0;
   }
   
   /* Insert key-value pair into BinarySearchTreeMap
      If key already exists, ignore it
   */
   // insert renamed to put, to match Map interface
   public void put(K k, V v) {
      this.size++;
      Node newNode = new Node();
      newNode.key = k;
      newNode.val = v;
      newNode.left = null;
      newNode.right = null;
      if (root == null)
        root = newNode;
      else
        insertSub(root, newNode);
   }
       
   private void insertSub(Node node, Node newNode){
      if (newNode.key.compareTo(node.key) < 0)
      {  if (node.left == null)
            node.left = newNode;
         else
            insertSub(node.left,newNode);
      }
      else if (newNode.key.compareTo(node.key) > 0)
      {  if (node.right == null) 
            node.right = newNode;
         else
            insertSub(node.right, newNode);
      }
      //else //key already in tree => do nothing
   }
 
   public void print(){
       if (root != null)
         printSub(root);
   }
   
   private void printSub(Node node){
      if (node != null)
      {
         printSub(node.left);
         System.out.println(node.key + " " + node.val);
         printSub(node.right);
      }
   } 

   /*
    *  Search BinarySearchTreeMap for given key, and return associated value if found,
    *  return null if not found
   */
   public V get(K key) {
        Node node = root;
        while (node != null) {
            int cmp = key.compareTo(node.key);
            if  (cmp < 0)
               node = node.left;
            else if (cmp > 0)
                node = node.right;
            else return node.val;
        }
        return null;
    }

    // does there exist a key-value pair with given key?
    public boolean contains(K key) {
        return get(key) != null;
    }
    
    public int height(){
        return heightSub(root); // if you consider the height of a 1 node (root) binary tree to be 
                               //  zero then subtract 1 from this to get a corrected answer.
    }
    public int heightSub(Node currentNode) {
        if (currentNode == null)
            return 1;
        else if (currentNode.left == null && currentNode.right == null)
            return 1;
        else if (currentNode.left == null && currentNode.right != null)
            return heightSub(currentNode.right) + 1;
        else if (currentNode.left != null && currentNode.right == null)
            return heightSub(currentNode.left) + 1;
        else
        {
            int h1 = heightSub(currentNode.left) + 1;
            int h2 = heightSub(currentNode.right) + 1;
            
            return h1 > h2 ? h1 : h2;  // same as: if h1 > h2 return h1 else return h2
        }
    }

    
    // sample client code
    public static void main(String[] args) {
        BinarySearchTreeMap<String, String> bstMap = new BinarySearchTreeMap();

        // insert some key-value pairs e.g. name, mobile number 
        //Not in order of name - why?
        bstMap.put("Jack",  "0871231231");
        bstMap.put("Jill",  "0877654321");
        bstMap.put("Bob",   "0871234567");
        bstMap.put("Rob",   "0851212121");
        
        bstMap.put("Jill",  "0867654321");  //what happens here?

        bstMap.print();
        
        System.out.println("Size of tree: "+ bstMap.size());
 
        // search for mobile number given name
        String number = bstMap.get("Jill");
        System.out.println(number); //what output do you expect here?

        number = bstMap.get("Bill");
        System.out.println(number); //what output do you expect here?
    
        if (bstMap.contains("Sam"))
            System.out.println("Sam is on the tree");
        else 
            System.out.println("Sam is not on the tree");
 
    }

}
