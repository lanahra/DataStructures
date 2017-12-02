package de.unistuttgart.dsaws2017.ex03.p1;

public class BSTNode<T> {

    private T value;
    private BSTNode<T> left;
    private BSTNode<T> right;

    public BSTNode(T value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public BSTNode<T> getLeft() {
        return this.left;
    }

    public void setLeft(BSTNode<T> left) {
        this.left = left;
    }

    public BSTNode<T> getRight() {
        return this.right;
    }

    public void setRight(BSTNode<T> right) {
        this.right = right;
    }
}
