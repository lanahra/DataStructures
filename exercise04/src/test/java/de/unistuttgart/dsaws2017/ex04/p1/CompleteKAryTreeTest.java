package de.unistuttgart.dsaws2017.ex04.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class CompleteKAryTreeTest {

    @Test
    public void testTree() {
        CompleteKAryTree<Integer> tree = new CompleteKAryTree(3);

        for (int i = 0; i < 10; i++) {
            tree.insert(i);
        }

        assertEquals(Integer.valueOf(3), tree.getChildOf(0, 3));
    }

}
