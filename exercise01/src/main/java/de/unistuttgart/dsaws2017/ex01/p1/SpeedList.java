package de.unistuttgart.dsaws2017.ex01.p1;

import java.lang.*;
import java.util.*;

public class SpeedList<T> implements ISpeedList<T>, ISpeedListIterable<T> {

    private class Node {

        private T element;
        private Node next;
        private Node eighth;

        public Node(T element) {
            this.element = element;
            next = null;
            eighth = null;
        }

        public T getElement() {
            return element;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Node getEighth() {
            return eighth;
        }

        public void setEighth(Node eighth) {
            this.eighth = eighth;
        }
    }

    private class SpeedListIterator implements Iterator<T> {

        private Node node;

        public SpeedListIterator() {
            node = SpeedList.this.head;
        }

        public boolean hasNext() {
            return node != null;
        }

        public T next() {
            if (node == null) {
                throw new NoSuchElementException();
            }

            Node next = node;
            node = node.getNext();
            return next.getElement();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private class SpeedListSkippingIterator implements Iterator<T> {

        private Node node;
        private int skip;
        private int eighths;
        private int ones;

        public SpeedListSkippingIterator(int skip) {
            node = SpeedList.this.head;
            this.skip = skip;
            eighths = skip / 8;
            ones = skip % 8;
        }

        public boolean hasNext() {
            return node != null;
        }

        public T next() {
            if (node == null) {
                throw new NoSuchElementException();
            }

            Node next = node;

            for (int i = 0; i < eighths; i++) {
                node = node.getEighth();

                if (node == null) {
                    break;
                }
            }

            if (node != null) {
                for (int i = 0; i < ones; i++) {
                    node = node.getNext();

                    if (node == null) {
                        break;
                    }
                }
            }

            return next.getElement();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }

    private Node head;

    public SpeedList() {
        head = null;
    }

    public int size() {
        int size = 0;
        Node node = head;

        while (node != null) {
            if (node.getEighth() != null) {
                size += 8;
                node = node.getEighth();
            } else {
                size++;
                node = node.getNext();
            }
        }

        return size;
    }

    public void prepend(T item) {
        Node node = new Node(item);
        Node eighth = null;

        if (this.size() >= 8) {
            eighth = head;

            for (int i = 0; i < 7; i++) {
                eighth = eighth.getNext();
            }
        }

        node.setNext(head);
        node.setEighth(eighth);
        head = node;
    }

    public T getElementAt(int pos) throws IndexOutOfBoundsException {
        Node node = getNodeAt(pos);

        return node.getElement();
    }

    public T getNext8thElementOf(int pos) throws IndexOutOfBoundsException {
        Node node = getNodeAt(pos);

        if (node.getEighth() == null) {
            throw new IndexOutOfBoundsException();
        }

        return node.getEighth().getElement();
    }

    public Iterator<T> iterator() {
        return new SpeedListIterator();
    }

    public Iterator<T> skippingIterator(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }

        return new SpeedListSkippingIterator(n);
    }

    private Node getNodeAt(int pos) {
        if (head == null
                || pos < 0
                || pos >= this.size()) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;
        int eighths = pos / 8;
        int ones = pos % 8;

        for (int i = 0; i < eighths; i++) {
            node = node.getEighth();
        }

        for (int i = 0; i < ones; i++) {
            node = node.getNext();
        }

        return node;
    }
}
