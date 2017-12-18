package de.unistuttgart.dsaws2017.ex04.p2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SorterTest {

    @Test
    public void testSorter() {
        SimpleList<Integer> list = new SimpleList();

        for (int i = 9; i >= 0; i--) {
            list.append(i);
        }

        Sorter.heapSort(list);

        for (int i = 0; i <= 9; i++) {
            assertEquals(Integer.valueOf(i), list.get(i));
        }
    }
}
