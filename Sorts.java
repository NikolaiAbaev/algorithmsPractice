public class Sorts {

    public static void selectionSortOwn (int[] array) {
        int n = array.length;
        int temp;
        int index;

        for (int i = 0; i < n; i++) {
            temp = array[i];
            index = i;
            for (int j = i; j < n; j++) {
                if (temp > array[j]) {
                    temp = array[j];
                    index = j;
                }
            }
            if (index != i) {
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }
    public static void selectionSortTextbook(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            // Find index of smallest remaining element
            int indexSmallest = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[indexSmallest]) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            int temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }
    }
    public static void selectionSortInefficient (int[] array) {
        int n = array.length;
        int temp;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void insertionSort (int[] array) {
        int temp;
        int n = array.length;

        for (int i = 1; i < n; i++) {
            int index = i;
            while (index > 0 && array[index] < array[index - 1]) {
                temp = array[index];
                array[index] = array[index - 1];
                array[index - 1] = temp;
                index --;
            }
        }
    }


    private static void merge (int[] array, int[] left, int[] right) {
        int leftN = left.length;
        int rightN = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftN && j < rightN) {
            if (left[i] <= right[j]) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftN) {
            array[k] = left[i];
            k++;
            i++;
        }

        while (j < rightN) {
            array[k] = right[j];
            k++;
            j++;
        }
    }

    public static void mergeSort (int[] array) {
        int n = array.length;
        if (n < 2) {return;}

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(array, left, right);
    }

    public static void shellSort (int[] array) {
        return;
    }

    public static void quickSort (int[] array) {
        return;
    }

    public static void bubbleSort (int[] array) {
        return;
    }
}
