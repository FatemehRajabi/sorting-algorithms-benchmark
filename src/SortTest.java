import java.util.Random;

public class SortTest {
    public static  void main(String args[]){
        InsertionSort insertionSort = new InsertionSort();
        Random random = new Random();

        int[] inputSizes = {1000, 5000, 10000, 50000, 60000};

        for(int size : inputSizes){
            int[] arrayToSort = new int[size];

            for (int i=0; i<size; i++){
                arrayToSort[i] = random.nextInt();
            }
            long totalTime = 0;

            for(int i=0; i<5; i++){
                int[] clone = arrayToSort.clone();

                long start = System.nanoTime();
                insertionSort.insertionSort(clone);
                long end = System.nanoTime();

                totalTime += (end - start);
            }
            long averageTime = totalTime / 5;
            System.out.println("Size: " + size + " -> Average Time: " + averageTime + " ns");
        }
    }
}
