package de.unistuttgart.dsaws2017.ex02.p1;

import static org.junit.Assert.*;

import org.junit.Test;

public class SorterTest {

    @Test
    public void testSelectionSort() {
        SimpleList<Integer> list = new SimpleList();

        for (int i = 9; i >= 0; i--) {
            list.append(i);
        }

        Sorter.selectionSort(list);

        for (int i = 0; i <= 9; i++) {
            assertEquals(Integer.valueOf(i), list.get(i));
        }
    }

    @Test
    public void testBubbleSort() {
        SimpleList<Integer> list = new SimpleList();

        for (int i = 9; i >= 0; i--) {
            list.append(i);
        }

        Sorter.bubbleSort(list);

        for (int i = 0; i <= 9; i++) {
            assertEquals(Integer.valueOf(i), list.get(i));
        }
    }

    @Test
    public void testShakerSort() {
        SimpleList<Integer> list = new SimpleList();

        for (int i = 9; i >= 0; i--) {
            list.append(i);
        }

        Sorter.shakerSort(list);

        for (int i = 0; i <= 9; i++) {
            assertEquals(Integer.valueOf(i), list.get(i));
        }
    }
}
