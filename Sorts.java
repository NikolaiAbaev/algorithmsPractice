public class Sorts {

  public static void selectionSort (int[] array){
    int n = array.length;
    int temp;
    for (int i = 0; i < n - 1; i++){
      for (int j = i + 1; j < n; j++){
        if (array[i] > array[j]){
          temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}
