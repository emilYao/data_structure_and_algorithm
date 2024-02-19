import java.util.Arrays;
import java.util.Collections;
import java.time.LocalTime;
class OuterClass{
    int x = 10;

    class InnerClass{
        int y = 5;
    }
}
public class Main {

    public static int search(int[] array, int key){
        for (int i=0; i<array.length; i++){
            if (array[i] == key){
                return i;
            }

        }
        return -1;
    }
    static class S1{
        int y = 5;
    }
    public class PaymentCategory{
        int categoryId;
        String categoryName;
        String categoryImgUrl;

        public PaymentCategory( int categoryId, String categoryName, String categoryImgUrl){
            this.categoryId = categoryId;
            this.categoryName = categoryName;
            this.categoryImgUrl = categoryImgUrl;

        }
    }
    public static void main(String[] args){

        int a1[] = {3,8,2,9,5};

        int indexValue = search(a1, 3);
        if (indexValue == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at " + indexValue );
        }
        Arrays.sort(a1);
        System.out.println(Arrays.toString(a1));
    }




}