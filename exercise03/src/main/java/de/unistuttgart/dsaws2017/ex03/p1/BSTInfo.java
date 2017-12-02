package de.unistuttgart.dsaws2017.ex03.p1;

public class BSTInfo {

    public static <T extends Comparable<T>> boolean isFull(BSTNode<T> node) {
        if (node == null) {
            return false;
        }

        if (node.getLeft() == null && node.getRight() == null) {
            return true;
        }

        return isFull(node.getLeft()) && isFull(node.getRight());
    }

    public static <T extends Comparable<T>> int countLeafNodes(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }

        if (node.getLeft() == null && node.getRight() == null) {
            return 1;
        }

        return countLeafNodes(node.getLeft()) + countLeafNodes(node.getRight());
    }
}
