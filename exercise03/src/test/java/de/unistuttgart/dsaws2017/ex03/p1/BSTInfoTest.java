package de.unistuttgart.dsaws2017.ex03.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BSTInfoTest {

    @Test
    public void testIsFull1() {
        BST<Integer> tree = new BST();

        assertEquals(false, BSTInfo.isFull(tree.getRoot()));
    }

    @Test
    public void testIsFull2() {
        BST<Integer> tree = new BST();

        tree.insert(10);

        assertEquals(true, BSTInfo.isFull(tree.getRoot()));
    }

    @Test
    public void testIsFull3() {
        BST<Integer> tree = new BST();

        tree.insert(10);
        tree.insert(8);
        tree.insert(11);
        tree.insert(12);

        assertEquals(false, BSTInfo.isFull(tree.getRoot()));
    }

    @Test
    public void testIsFull4() {
        BST<Integer> tree = new BST();

        tree.insert(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(11);
        tree.insert(13);

        assertEquals(true, BSTInfo.isFull(tree.getRoot()));
    }

    @Test
    public void testCountLeafNodes1() {
        BST<Integer> tree = new BST();

        assertEquals(0, BSTInfo.countLeafNodes(tree.getRoot()));
    }

    @Test
    public void testCountLeafNodes2() {
        BST<Integer> tree = new BST();

        tree.insert(10);

        assertEquals(1, BSTInfo.countLeafNodes(tree.getRoot()));
    }

    @Test
    public void testCountLeafNodes3() {
        BST<Integer> tree = new BST();

        tree.insert(10);
        tree.insert(8);
        tree.insert(11);
        tree.insert(12);

        assertEquals(2, BSTInfo.countLeafNodes(tree.getRoot()));
    }

    @Test
    public void testCountLeafNodes4() {
        BST<Integer> tree = new BST();

        tree.insert(10);
        tree.insert(8);
        tree.insert(12);
        tree.insert(11);
        tree.insert(13);

        assertEquals(3, BSTInfo.countLeafNodes(tree.getRoot()));
    }
}
