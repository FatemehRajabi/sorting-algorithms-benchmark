import java.util.Random;

public class SortTest {
    public static  void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();

        Random random = new Random();

        int[] inputSizes = {1000, 5000, 10000, 50000, 60000};

        for(int size : inputSizes){
            System.out.println("\nTesting input size: " + size);

            int[] arrayToSort = new int[size];

            for (int i=0; i<size; i++){
                arrayToSort[i] = random.nextInt();
            }

            // Insertion Sort
            long insertionTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = arrayToSort.clone();
                long start = System.nanoTime();
                insertionSort.insertionSort(clone);
                long end = System.nanoTime();
                insertionTotal += (end - start);
            }
            System.out.println("Insertion Sort: " + (insertionTotal / 5) + " ns");

            // Merge Sort
            long mergeTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = arrayToSort.clone();
                long start = System.nanoTime();
                mergeSort.mergeSort(clone);
                long end = System.nanoTime();
                mergeTotal += (end - start);
            }
            System.out.println("Merge Sort: " + (mergeTotal / 5) + " ns");

            // Heap Sort
            long heapTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = arrayToSort.clone();
                long start = System.nanoTime();
                heapSort.heapSort(clone);
                long end = System.nanoTime();
                heapTotal += (end - start);
            }
            System.out.println("Heap Sort: " + (heapTotal / 5) + " ns");

            // Quick Sort
            long quickTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = arrayToSort.clone();
                long start = System.nanoTime();
                quickSort.quickSort(clone);
                long end = System.nanoTime();
                quickTotal += (end - start);
            }
            System.out.println("Quick Sort: " + (quickTotal / 5) + " ns");
        }
    }
}
