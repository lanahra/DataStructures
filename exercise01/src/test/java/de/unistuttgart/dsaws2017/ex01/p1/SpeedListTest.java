package de.unistuttgart.dsaws2017.ex01.p1;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.*;

public class SpeedListTest {

    @Test
    public void shouldTestSizeOfEmptyList() {
        SpeedList<Integer> list = new SpeedList();

        assertEquals(0, list.size());
    }

    @Test
    public void shouldTestPrependingList() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 3; i++) {
           list.prepend(i);
        }

        assertEquals(3, list.size());
    }

    @Test
    public void shouldTestMoreThanEightElements() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 9; i++) {
           list.prepend(i);
        }

        assertEquals(9, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowGetElementEmptyList() {
        SpeedList<Integer> list = new SpeedList();

        list.getElementAt(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowGetElementNegative() {
        SpeedList<Integer> list = new SpeedList();

        list.prepend(0);

        list.getElementAt(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowGetElementOutOfBounds() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 3; i++) {
           list.prepend(i);
        }

        list.getElementAt(3);
    }

    @Test
    public void shouldGetElementAtTwo() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 10; i++) {
           list.prepend(i);
        }

        assertEquals(Integer.valueOf(7), list.getElementAt(2));
    }

    @Test
    public void shouldGetElementAtEight() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 9; i++) {
           list.prepend(i);
        }

        assertEquals(Integer.valueOf(0), list.getElementAt(8));
    }

    @Test
    public void shouldGetElementAtNineteen() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 20; i++) {
           list.prepend(i);
        }

        assertEquals(Integer.valueOf(0), list.getElementAt(19));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowGetNext8thElementEmptyList() {
        SpeedList<Integer> list = new SpeedList();

        list.getNext8thElementOf(0);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowGetNext8thElementNegative() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 8; i++) {
           list.prepend(i);
        }

        list.getNext8thElementOf(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void shouldThrowGetNext8thElementOutOfBounds() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 8; i++) {
           list.prepend(i);
        }

        list.getNext8thElementOf(1);
    }

    @Test
    public void shouldGetNext8thElementOfOne() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 10; i++) {
           list.prepend(i);
        }

        assertEquals(Integer.valueOf(0), list.getNext8thElementOf(1));
    }

    @Test
    public void shouldGetNext8thElementOfSixteen() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 25; i++) {
           list.prepend(i);
        }

        assertEquals(Integer.valueOf(0), list.getNext8thElementOf(16));
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowNextEmptyIterator() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.iterator();

        iterator.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowRemoveUnsupported() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.iterator();

        iterator.remove();
    }

    @Test
    public void shouldReturnFalseHasNextEmptyIterator() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.iterator();

        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void shouldReturnTrueHasNextIterator() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 5; i++) {
           list.prepend(i);
        }

        Iterator<Integer> iterator = list.iterator();

        assertEquals(true, iterator.hasNext());
    }

    @Test
    public void shouldIterateWholeIterator() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 5; i++) {
           list.prepend(i);
        }

        Iterator<Integer> iterator = list.iterator();

        int i = 4;
        while (iterator.hasNext()) {
            assertEquals(Integer.valueOf(i), iterator.next());
            i--;
        }
    }

    @Test(expected = NoSuchElementException.class)
    public void shouldThrowNextEmptySkippingIterator() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.skippingIterator(2);

        iterator.next();
    }

    @Test(expected = UnsupportedOperationException.class)
    public void shouldThrowRemoveUnsupportedSkipping() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.skippingIterator(2);

        iterator.remove();
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowLessThanOneSkipping() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.skippingIterator(0);
    }

    @Test
    public void shouldReturnFalseHasNextEmptySkippingIterator() {
        SpeedList<Integer> list = new SpeedList();

        Iterator<Integer> iterator = list.skippingIterator(2);

        assertEquals(false, iterator.hasNext());
    }

    @Test
    public void shouldReturnTrueHasNextSkippingIterator() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 5; i++) {
           list.prepend(i);
        }

        Iterator<Integer> iterator = list.skippingIterator(2);

        assertEquals(true, iterator.hasNext());
    }

    @Test
    public void shouldIterateWholeSkippingIterator() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 5; i++) {
           list.prepend(i);
        }

        Iterator<Integer> iterator = list.skippingIterator(2);

        int i = 4;
        while (iterator.hasNext()) {
            assertEquals(Integer.valueOf(i), iterator.next());
            i -= 2;
        }
    }

    @Test
    public void shouldIterateWholeMoreThanEightSkippingIterator() {
        SpeedList<Integer> list = new SpeedList();

        for (int i = 0; i < 100; i++) {
           list.prepend(i);
        }

        Iterator<Integer> iterator = list.skippingIterator(19);

        int i = 99;
        while (iterator.hasNext()) {
            assertEquals(Integer.valueOf(i), iterator.next());
            i -= 19;
        }
    }
}
