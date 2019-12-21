import sortingMethods.SortingMethods;

import java.util.Arrays;

import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

public class Main {
    public static void main(String[] args) {
        int[] testArr = {1, 5, 8, 4, 21, 15, 3, 8, 6};

        assertTrue(isAnagram("angel", "angle"));
        assertFalse(isAnagram("abc", "bda"));
        assertFalse(isAnagram("abbc", "abcc"));

        int x = factorial(5);

        System.out.println(x);

    }

    private static void bubbleSorting(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int x = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = x;
                }
            }
        }
    }

    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];

        }
    }

    public static boolean isAnagram(String s1, String s2) {

        char[] first = s1.toUpperCase().toCharArray();
        char[] second = s2.toUpperCase().toCharArray();
        boolean conditional=false;

        Arrays.sort(first);
        Arrays.sort(second);
        for (int i=0; i<first.length; i++) {
            conditional = first[i]==second[i];
            if (conditional == false) {
                break;
            }
        }

        return conditional;
    }

    public static Integer factorial(int n) {
        int result;
        if (n>1) {
            result = n * factorial(n-1);
        } else {
            result = n;
        }
        return result;
    }
}
