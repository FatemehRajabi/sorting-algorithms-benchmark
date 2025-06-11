public class QuickSort {

    public void quickSort(int[] array){
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int low, int high){
        if(low < high){
            int pivotIndex = partition(array, low, high);
            quickSort(array, low, pivotIndex-1);
            quickSort(array, pivotIndex+1, high);
        }
    }

    private int partition(int[] array, int low, int high){

        int randomIndex = low + (int)(Math.random() * (high - low + 1));
        int temporary = array[randomIndex];
        array[randomIndex] = array[high];
        array[high] = temporary;

        int pivot = array[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(array[j] <= pivot){
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i+1;
    }
}

//
//
//import java.util.Random;
//
//public class QuickSort {
//    private Random random = new Random();
//
//    public void quickSort(int[] array) {
//        if (array == null || array.length <= 1) return;
//        quickSort(array, 0, array.length - 1);
//    }
//
//    private void quickSort(int[] array, int low, int high) {
//        if (low < high) {
//            // Randomize pivot selection
//            randomizePivot(array, low, high);
//
//            int pivotIndex = partition(array, low, high);
//            quickSort(array, low, pivotIndex - 1);
//            quickSort(array, pivotIndex + 1, high);
//        }
//    }
//
//    private void randomizePivot(int[] array, int low, int high) {
//        // Generate random index between low and high (inclusive)
//        int randomIndex = low + random.nextInt(high - low + 1);
//
//        // Swap random element with last element (which partition uses as pivot)
//        swap(array, randomIndex, high);
//    }
//
//    private int partition(int[] array, int low, int high) {
//        int pivot = array[high]; // Now this is a randomized element
//        int i = low - 1;
//
//        for (int j = low; j < high; j++) {
//            if (array[j] <= pivot) {
//                i++;
//                swap(array, i, j);
//            }
//        }
//        swap(array, i + 1, high);
//        return i + 1;
//    }
//
//    private void swap(int[] array, int i, int j) {
//        int temp = array[i];
//        array[i] = array[j];
//        array[j] = temp;
//    }
//}
