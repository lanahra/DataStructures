package de.unistuttgart.dsaws2017.ex03.p1;

public class BST<T extends Comparable<T>> {

    private BSTNode<T> root;

    public BST() {
        this.root = null;
    }

    public BSTNode<T> getRoot() {
        return this.root;
    }

    public void insert(T value) {
        this.root = this.insert(this.root, value);
    }

    private BSTNode<T> insert(BSTNode<T> node, T value) {
        if (node == null) {
            return new BSTNode<T>(value);
        } else if (value.compareTo(node.getValue()) < 0) {
            node.setLeft(this.insert(node.getLeft(), value));
        } else if (value.compareTo(node.getValue()) > 0) {
            node.setRight(this.insert(node.getRight(), value));
        }
        return node;
    }
}
