/**
 * Created by YSingh on 16/04/17.
 */
public class UpdateArray {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5, 6};
        updateArray(arr, arr.length - 1);
        printArray(arr, arr.length - 1);
        System.out.println();
        printTable(2);
    }

    private static void printTable(int n) {
        printTab(n, 1);
    }

    private static void printTab(int n, int i) {
        if(i > 10) {
            return;
        }
        System.out.println(n*i);
        printTab(n, i + 1);
    }

    private static void printArray(int[] arr, int n) {
        if(n > 0) {
            printArray(arr, n - 1);
            System.out.print(arr[n] + " ");
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
