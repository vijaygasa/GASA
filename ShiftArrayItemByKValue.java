import java.util.Arrays;

public class ShiftArrByKVal {

    public static void swap(int[] arr, int index, int new_index){
        int new_val = arr[new_index];
        arr[new_index] = arr[index];
        arr[index] = new_val;
    }

    /**
     *
     * @param arr
     * @param shiftVal
     * Move the array item by adding shiftval .
     * If the added value is beyond array boundary , decrement by array length.
     */
    public static void shift_items_by_k_value(int[] arr, int shiftVal){
        int n = arr.length;
        for(int i=0;i<n;i++){
            if(i+shiftVal>=n){
                int index = (i+shiftVal)-n;
                swap(arr, i, index);
            }else{
                swap(arr, i, i+shiftVal);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,4,5,6,8,9};
        int k = 4;
        int n = arr.length;
        shift_items_by_k_value(arr, k);
        System.out.println(Arrays.toString(arr));
    }
}
