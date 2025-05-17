import java.util.*;

class Merge {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 8, 8, 8, 9, 5, 62, 6, 59, 8, 5, 4};
        divide(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    static void divide(int[] arr, int s, int e) {
        if (s < e) {
            int m = s + (e - s) / 2;
            divide(arr, s, m);
            divide(arr, m + 1, e);
            merge(arr, s, m, e);
        }
    }

    static void merge(int[] arr, int s, int m, int e) {
        int[] ll = new int[m - s + 1];
        int[] rr = new int[e - m];

        for (int i = 0; i < ll.length; i++) {
            ll[i] = arr[s + i];
        }

        for (int i = 0; i < rr.length; i++) {
            rr[i] = arr[m + 1 + i];
        }

        int i = 0, j = 0, k = s;

        while (i < ll.length && j < rr.length) {
            if (ll[i] <= rr[j]) {
                arr[k++] = ll[i++];
            } else {
                arr[k++] = rr[j++];
            }
        }

        while (i < ll.length) {
            arr[k++] = ll[i++];
        }

        while (j < rr.length) {
            arr[k++] = rr[j++];
        }
    }
}
