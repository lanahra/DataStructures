package de.unistuttgart.dsaws2017.ex04.p1;

import java.util.List;

/*
 * Interface for k-ary trees
 * @param <T>  The type of elements
 */
public interface IKAryTree<T extends Comparable<T>> {
    /*
     * Returns the array which stores all elements of the tree.
     * 
     * @return the array which stores all elements of the tree 
     */
    public List<T> getArray();

    /*
     * Inserts an element into the tree in level-order.
     * 
     * @param element element to be inserted
     */
    public void insert(T element);

    /*
     * Returns the element stored in the corresponding child of a given node.
     * 
     * @param nodeIndex the index of the node starting from 0 to the number of nodes minus 1
     * @param childIndex the index of the child starting from 0 to k-1
     * 
     * @return the element stored in the corresponding child of a given node or null if the child does not exist
     * @throw IndexOutOfBoundsException if (nodeIndex >= size of array) 
     */
    public T getChildOf(int nodeIndex, int childIndex) throws IndexOutOfBoundsException;

}
