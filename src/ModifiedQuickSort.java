public class ModifiedQuickSort {

    InsertionSort insertionSort = new InsertionSort();

    public void modifiedQuickSort(int[] array){
        modifiedQuickSort(array,0, array.length -1);
    }

    private void modifiedQuickSort(int[] array, int low, int high){
        int arraySubLength = high - low + 1;
        if (arraySubLength <= 15){
            insertionSort.insertionSort(array, low, high);
            return;
        } else {
            int mid = (low + high) / 2;

            int a = array[low];
            int b = array[mid];
            int c = array[high];

            if ((a <= b && b <= c) || (c <= b && b <= a)){
                int temp = array[mid];
                array[mid] = array[high];
                array[high] = temp;
            } else if ((b <= a && a <= c) || (c <= a && a <= b)){
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }
            int pivotIndex = partition(array, low, high);
            modifiedQuickSort(array, low, pivotIndex-1);
            modifiedQuickSort(array, pivotIndex+1, high);


        }
    }
    private int partition(int[] array, int low, int high){
        int pivot = array[high];
        int i = low - 1;

        for(int j=low; j<high; j++){
            if(array[j] < pivot){
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
