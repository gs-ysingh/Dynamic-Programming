/**
 * Created by YSingh on 16/04/17.
 */
public class UpdateArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        updateArray(arr, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    private static int updateArray(int[] arr, int n) {
        if(n == 0) {
            return arr[n];
        }
        arr[n] = arr[n] + updateArray(arr, n - 1);
        return arr[n];
    }

}
