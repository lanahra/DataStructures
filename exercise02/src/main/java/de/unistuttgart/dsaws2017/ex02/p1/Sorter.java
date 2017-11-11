package de.unistuttgart.dsaws2017.ex02.p1;

public class Sorter {

    public static <T extends Comparable<T>> void selectionSort(ISimpleList<T> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int smallest = i;

            for(int j = i + 1; j < list.size(); j++) {
                if (list.get(j).compareTo(list.get(smallest)) < 0) {
                    smallest = j;
                }
            }

            if (smallest != i) {
                list.swap(i, smallest);
            }
        }
    }

    public static <T extends Comparable<T>> void bubbleSort(ISimpleList<T> list) {
        int size = list.size();
        int newSize;

        do {
            newSize = 0;

            for (int i = 1; i < size; i++) {
                if (list.get(i - 1).compareTo(list.get(i)) > 0) {
                    list.swap(i - 1, i);
                    newSize = i;
                }
            }

            size = newSize;
        } while (size != 0);
    }

    public static <T extends Comparable<T>> void shakerSort(ISimpleList<T> list) {
        int begin = 0;
        int end = list.size() - 1;
        int newBegin;
        int newEnd;
        boolean swapped;

        while (begin <= end) {
            newBegin = end;
            newEnd = begin;
            swapped = false;

            for (int i = begin; i < end; i++) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    list.swap(i, i + 1);
                    swapped = true;
                    newEnd = i;
                }
            }

            if (!swapped) {
                break;
            }

            end = newEnd;
            swapped = false;

            for (int i = end - 1; i >= begin; i--) {
                if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                    list.swap(i, i + 1);
                    newBegin = i;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }

            begin = newBegin + 1;
        }
    }
}
