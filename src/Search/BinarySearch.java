package Search;

public class BinarySearch {
    public static int recursiveBinarySearch(int[] a1, int key, int first, int last){
        int mid = (first + last) /2;
        if (first < last){
            if (a1[mid] == key){
                return mid;
            }
            else if (key > a1[mid]){
                return recursiveBinarySearch(a1, key, mid+1, last);
            }
            else if (key < a1[mid]){
                return recursiveBinarySearch(a1, key, first, mid-1);
            }
        }

        return -1;
    }

    public static void main(String args[]){
        int[] a1 = new int[]{1,2,3,4,5,6,7};
        int index = recursiveBinarySearch(a1, 6, 0, a1.length-1);

        if (index == -1){
            System.out.println("element not found in the given array");
        }
        else{
            System.out.println("element found at the index " + index);
        }
    }
}
