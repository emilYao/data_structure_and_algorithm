package Search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String args[]){
        int a1[] = new int[] {6,4,5,8,2,1,9};
        Scanner s1 = new Scanner(System.in);
        int count = 0;
        int key = s1.nextInt();

        for (int i =0; i< a1.length; i++){
            if (a1[i] == key) {
                System.out.println("Element is at index " + i);
                count++;
            }
        }
        if (count == 0 ){
            System.out.print("Element not found in the given array");
        }
    }
}
