/**                                                                                              
 * A node object that only consists of the java default constructor, the generic                 
 * object T named "info", the left child node, and the right child node. Allows for
 * a binary search tree to be created.
 */
public class NodeType<T extends Comparable<T>> {
    public T key;
    public NodeType<T> left;
    public NodeType<T> right;
} // NodeType 
