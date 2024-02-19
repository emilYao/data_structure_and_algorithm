package Sort;

import java.util.Arrays;

public class InsertingSort {

    public static void main(String args[]){
        int[] s1 = new int[]{1,10,8,3,1,9,4,6};
        for (int i=1; i< s1.length; i++){
            int b = s1[i];
            int j = i-1;
//            int idx = i;
                while (j>=0 && b < s1[j]){
                    s1[j+1] = s1[j];
                    s1[j] = b;
                    j--;
                }
//            for (int j=i-1; j>=0; j--){
//
//                if (b < s1[j]){
//                    s1[idx] = s1[j];
//                    s1[j] = b;
//                    idx --;
//                }
//                else{
//                    continue;
//                }
//            }


        }

        System.out.print(Arrays.toString(s1));
    }
}
