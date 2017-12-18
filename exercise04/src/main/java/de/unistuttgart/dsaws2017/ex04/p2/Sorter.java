package de.unistuttgart.dsaws2017.ex04.p2;

public class Sorter {

    public static <T extends Comparable<T>> void heapSort(ISimpleList<T> list) {
        for (int i = list.size() / 2; i >= 0; i--) {
            Sorter.sift(list, i, list.size());
        }

        for (int i = list.size() - 1; i > 0; i--) {
            list.swap(0, i);
            Sorter.sift(list, 0, i);
        }
    }

    private static <T extends Comparable<T>> void sift(ISimpleList<T> list, int idx, int size) {
        int i = idx;
        int j;

        while (2 * i + 1 < size) {
            j = 2 * i + 1;

            if (j + 1 < size) {
                if (list.get(j).compareTo(list.get(j + 1)) < 0) {
                    j++;
                }
            }

            if (list.get(i).compareTo(list.get(j)) < 0) {
                list.swap(i, j);
                i = j;
            } else {
                break;
            }
        }
    }
}
