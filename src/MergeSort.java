public class MergeSort {

    public int[] mergeSort(int[] array){
        int[] left;
        int[] right;

        if(array.length <= 1){
            return array;
        } else {
            int mid = (array.length/2);
            left = new int[mid];
            right = new int[array.length - mid];
            System.arraycopy(array, 0, left, 0,mid);
            System.arraycopy(array, mid, right, 0, array.length-mid);
            left = mergeSort(left);
            right = mergeSort(right);
        }

        return merge(left, right);
    }
    public int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<left.length && j<right.length){
            if(left[i] <= right[j]){
                result[k] = left[i];
                k++;
                i++;
            } else {
                result[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length){
            result[k] = left[i];
            k++;
            i++;
        }
        while (j < right.length){
            result[k] = right[j];
            k++;
            j++;
        }

        return result;
    }
}
