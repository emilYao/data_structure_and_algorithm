package Sort;

import java.util.Arrays;

public class QuickSort {
    static int partition(int[] a1, int first, int last){
        int pivot = a1[last];
        int i = first - 1;
        for (int j=first; j<last; j++){
            if(a1[j] <= pivot){
                i++;
                int swap = a1[i];
                a1[i] = a1[j];
                a1[j] = swap;

            }

        }
        int swap = a1[i+1];
        a1[i+1] = a1[last];
        a1[last] = swap;
        return i+1;
    }

    static void sort(int[] a1, int first, int last){
        if (first < last){
            int mid= partition(a1, first, last);
            sort(a1, first, mid -1);
            sort(a1, mid+1, last);
        }

    }

    public static void main(String[] args){
        int[] a1 = new int[] {2,6,3,9,5,1};

        sort(a1, 0, a1.length -1);

        System.out.print(Arrays.toString(a1));
    }
}
