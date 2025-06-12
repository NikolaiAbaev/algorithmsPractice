public class Sorts {

    public static void selectionSortUpdate (int[] array) {
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
            array[index] = array[i];
            array[i] = temp;
        }
    }

    public static void selectionSortOriginal (int[] array) {
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


}
