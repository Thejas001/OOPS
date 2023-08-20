import java.util.Arrays;

public class BubbleSortGeneric<T extends Comparable<? super T>> {
    T[] array;

    BubbleSortGeneric(T[] array) {
        this.array = array;
    }

    private T[] bubbleSort() {
        for (int i = array.length; i > 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                // if greater, swap elements
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swapElements(j, array);
                }
            }
        }
        return array;
    }

    private void swapElements(int index, T[] arr) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

    public static void main(String[] args) {
        Integer[] intArr = {56, 23, 14, 65, 12, 8, 34, 10, -5, -2};
        BubbleSortGeneric<Integer> bsg1 = new BubbleSortGeneric<>(intArr);
        Integer[] sa1 = bsg1.bubbleSort();
        System.out.println("Sorted array - " + Arrays.toString(sa1));

        String[] strArr = {"hello", "good", "spell", "write", "sort"};
        BubbleSortGeneric<String> bsg2 = new BubbleSortGeneric<>(strArr);
        String[] sa2 = bsg2.bubbleSort();
        System.out.println("Sorted array - " + Arrays.toString(sa2));
    }
}
