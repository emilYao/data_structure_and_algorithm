package Sort;

import java.util.Arrays;

public class SeletionSort  {

    public static void main(String[] arg){
        int[] s1 = new int[]{1,10,8,3,1,9,4,6};

        for (int i=0; i<s1.length; i++){
            int tempIdx = i;

            for (int j=1; j<s1.length;j++){
                if (s1[i] < s1[j]){
                    tempIdx = j;
                }
            }
            s1[i] = s1[tempIdx];
            s1[tempIdx] = s1[i];
            System.out.print(Arrays.toString(s1));
        }
    }
}
