
import java.util.Arrays;



public class swap {
    public static void main(String[] args) {
        int[] arr = {12,13,14,15,116,17,18};
        swap(arr,1,3);
        System.out.print(Arrays.toString(arr));
    }
    
    static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
