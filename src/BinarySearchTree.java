public class BinarySearchTree<T extends Comparable<T>> {
    private NodeType<T> root;

    public BinarySearchTree() {
	NodeType<T> root = new NodeType<T>();
    } // constructor

    public void insert(T key) {
	NodeType<T> newNode = new NodeType<T>();
	newNode.key = key;
	newNode.left = null;
	newNode.right = null;
	NodeType<T> temp = root;

	if (root == null) {
	    root = newNode;
	} else {
	    insertRec(key, temp);		       	
	} // if else

    } // insert

    public NodeType<T> insertRec(T key, NodeType<T> n) {
	if (n == null) {
	    NodeType<T> newNode = new NodeType<T>();
	    newNode.key = key;
	    newNode.left = null;
	    newNode.right = null;
	    return newNode;
	} else if (n.key.compareTo(key) > 0) {
	    n.left = insertRec(key, n.left);
	} else if (n.key.compareTo(key) < 0) {
	    n.right = insertRec(key, n.right);
	} // if else
	return n;
    } // insertRec

    public void delete(T key) {
	System.out.println("not yet impl");
    } // delete

    public boolean retrieve(T item) {
	NodeType<T> temp = root;
	while (temp != null)  {
	    if (temp.key.compareTo(item) > 0) {
		temp = temp.left;
	    } else if (temp.key.compareTo(item) < 0) {
		temp = temp.right;
	    } else{
		return true;
	    } // if else
	} // while
	return false;
    } // retrieve

    public void inOrder() {
	NodeType<T> temp = root;
	inOrderRec(temp);
    } // inOrder
    
    public void inOrderRec(NodeType<T> n) {

	if (n != null) {
	    inOrderRec(n.left);
	    System.out.println(n.key);
	    inOrderRec(n.right);
	}  // if
    } // inOrderRec
			   
    // getSingleParent
    // getNumLeafNodes
    // getCousins
    


} // BinarySearchTree
