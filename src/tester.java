public class tester {
    public static void main(String[] args) {
	System.out.println("fuck you");
	
	BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
	bst.insert(20);
	bst.insert(10);
	bst.insert(30);
	bst.insert(5);
	bst.insert(15);
	bst.insert(12);
	bst.insert(40);
	bst.inOrder();
	System.out.println(bst.retrieve(10));
	System.out.println(bst.retrieve(20));
	System.out.println(bst.retrieve(40));
	System.out.println(bst.retrieve(8));
	System.out.println(bst.retrieve(100));
	System.out.println(bst.retrieve(1002));
    } // main
} // tester
