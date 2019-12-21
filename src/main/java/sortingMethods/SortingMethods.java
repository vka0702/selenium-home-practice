package sortingMethods;

public class SortingMethods {

    public static void bubbleSorting(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (arr[j] > arr[j + 1]) {
                    int x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {

    }
}

