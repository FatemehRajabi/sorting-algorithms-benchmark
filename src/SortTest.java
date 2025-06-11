import java.util.Arrays;
import java.util.Random;

public class SortTest {
    public static  void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();
        MergeSort mergeSort = new MergeSort();
        HeapSort heapSort = new HeapSort();
        QuickSort quickSort = new QuickSort();
        ModifiedQuickSort modifiedQuickSort = new ModifiedQuickSort();

        Random random = new Random();

        int[] inputSizes = {1000, 5000, 10000, 50000, 60000};

        for(int size : inputSizes){
            System.out.println("\nTesting input size: " + size);

            int[] arrayToSort = new int[size];

            for (int i=0; i<size; i++){
                arrayToSort[i] = random.nextInt();
            }

            int [] sortedArray = arrayToSort.clone();
            Arrays.sort(sortedArray);

            int[] reversedArray = arrayToSort.clone();
            Arrays.sort(reversedArray);
            for (int i = 0; i < reversedArray.length / 2; i++) {
                int temp = reversedArray[i];
                reversedArray[i] = reversedArray[reversedArray.length - 1 - i];
                reversedArray[reversedArray.length - 1 - i] = temp;
            }
//----------------------------------------------------------------------------------------------------------------------
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

            insertionTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = sortedArray.clone();
                long start = System.nanoTime();
                insertionSort.insertionSort(clone);
                long end = System.nanoTime();
                insertionTotal += (end - start);
            }
            System.out.println("(sorted input) Insertion Sort: " + (insertionTotal / 5) + " ns");

            insertionTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = reversedArray.clone();
                long start = System.nanoTime();
                insertionSort.insertionSort(clone);
                long end = System.nanoTime();
                insertionTotal += (end - start);
            }
            System.out.println("(reversed input) Insertion Sort: " + (insertionTotal / 5) + " ns");


//----------------------------------------------------------------------------------------------------------------------
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

            mergeTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = sortedArray.clone();
                long start = System.nanoTime();
                mergeSort.mergeSort(clone);
                long end = System.nanoTime();
                mergeTotal += (end - start);
            }
            System.out.println("(sorted input) Merge Sort: " + (mergeTotal / 5) + " ns");

            mergeTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = reversedArray.clone();
                long start = System.nanoTime();
                mergeSort.mergeSort(clone);
                long end = System.nanoTime();
                mergeTotal += (end - start);
            }
            System.out.println("(reversed input) Merge Sort: " + (mergeTotal / 5) + " ns");

//----------------------------------------------------------------------------------------------------------------------
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

            heapTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = sortedArray.clone();
                long start = System.nanoTime();
                heapSort.heapSort(clone);
                long end = System.nanoTime();
                heapTotal += (end - start);
            }
            System.out.println("(sorted input) Heap Sort: " + (heapTotal / 5) + " ns");

            heapTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = reversedArray.clone();
                long start = System.nanoTime();
                heapSort.heapSort(clone);
                long end = System.nanoTime();
                heapTotal += (end - start);
            }
            System.out.println("(reversed input) Heap Sort: " + (heapTotal / 5) + " ns");

//----------------------------------------------------------------------------------------------------------------------
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

            quickTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = sortedArray.clone();
                long start = System.nanoTime();
                quickSort.quickSort(clone);
                long end = System.nanoTime();
                quickTotal += (end - start);
            }
            System.out.println("(sorted input) Quick Sort: " + (quickTotal / 5) + " ns");

            quickTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = reversedArray.clone();
                long start = System.nanoTime();
                quickSort.quickSort(clone);
                long end = System.nanoTime();
                quickTotal += (end - start);
            }
            System.out.println("(reversed input) Quick Sort: " + (quickTotal / 5) + " ns");


//----------------------------------------------------------------------------------------------------------------------
            // Modified Quick Sort
            long modifiedQuickTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = arrayToSort.clone();
                long start = System.nanoTime();
                modifiedQuickSort.modifiedQuickSort(clone);
                long end = System.nanoTime();
                modifiedQuickTotal += (end - start);
            }
            System.out.println("Modified Quick Sort: " + (modifiedQuickTotal / 5) + " ns");

            modifiedQuickTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = sortedArray.clone();
                long start = System.nanoTime();
                modifiedQuickSort.modifiedQuickSort(clone);
                long end = System.nanoTime();
                modifiedQuickTotal += (end - start);
            }
            System.out.println("(sorted input) Modified Quick Sort: " + (modifiedQuickTotal / 5) + " ns");

            modifiedQuickTotal = 0;
            for (int i = 0; i < 5; i++) {
                int[] clone = reversedArray.clone();
                long start = System.nanoTime();
                modifiedQuickSort.modifiedQuickSort(clone);
                long end = System.nanoTime();
                modifiedQuickTotal += (end - start);
            }
            System.out.println("(reversed input) Modified Quick Sort: " + (modifiedQuickTotal / 5) + " ns");

        }
    }
}
