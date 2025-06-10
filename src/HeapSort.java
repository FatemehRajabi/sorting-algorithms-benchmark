import java.util.ArrayList;

public class HeapSort {


    private ArrayList<Integer> heap;
    public HeapSort(){
        heap = new ArrayList<>();
    }
    public void insert(int value){
        heap.add(value);
        int index = heap.size() - 1;
        while (index > 0){
            int parent = (index -1) / 2;
            if (heap.get(index) > heap.get(parent)){
                int temp = heap.get(index);
                heap.set(index, heap.get(parent));
                heap.set(parent, temp);
                index = parent;
            } else {
                break;
            }
        }
    }

    public int remove(){
        if (heap.isEmpty()){
            return -1;
        } else {
            int max = heap.get(0);
            heap.set(0, heap.get(heap.size() - 1));
            heap.remove(heap.size() - 1);

            int index = 0;

            while (true){
                int leftChild = 2 * index + 1;
                int rightChild = 2 * index + 2;
                int largerChild = index;

                if (leftChild < heap.size() && heap.get(leftChild) > heap.get(largerChild)) {
                    largerChild = leftChild;
                }

                if (rightChild < heap.size() && heap.get(rightChild) > heap.get(largerChild)) {
                    largerChild = rightChild;
                }

                if(largerChild == index){
                    break;
                } else {
                    int temp = heap.get(index);
                    heap.set(index, heap.get(largerChild));
                    heap.set(largerChild, temp);

                    index = largerChild;
                }
            }
            return max;
        }
    }

    public int[] heapSort(int[] array){
        int[] result = new int[array.length];

        heap.clear();
        for (int i : array){
            insert(i);
        }
        for (int j=0; j< array.length; j++){
            result[j] = remove();
        }
        return result;
    }
}
