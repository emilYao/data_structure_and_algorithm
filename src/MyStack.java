import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Stack;

class QueueUsingArray{
    int front_Q, rear_Q;
    int capacityOfQueue;
    static int[] q1;

    QueueUsingArray(int size){
        capacityOfQueue = size;
        q1 = new int[size];
    }

    void enqueue(int value){

        if (rear_Q == capacityOfQueue){
            System.out.println("queue is already full, you cannot insert element");
        }
        else{

            q1[rear_Q] = value;
           rear_Q ++;
        }
    }

    void dequeue(){
        if (rear_Q == 0){
            System.out.println("queue is empty, there is nothing to delete");
        }
        else{
            for (int i = 0; i < rear_Q - 1 ; i++){
                q1[i] = q1[i+1];
            }
            rear_Q --;
        }
    }

    void display(){
        if (rear_Q ==0){
            System.out.println("queue is empty, nothing to display");
        }
        else{
            System.out.println(Arrays.toString(q1));
        }
    }
}
public class MyStack {

        public static void main(String[] arg){
                Stack<Integer> s1 = new Stack<>();

                s1.push(1);
                s1.push(2);
                s1.push(3);

            QueueUsingArray q2 = new QueueUsingArray(5);

            q2.enqueue(3);
            q2.enqueue(8);
            q2.enqueue(1);
            q2.display();

            Iterator it = s1.iterator();

               while ( it.hasNext()){
                       Object s2 = it.next();
                       System.out.print(s2);
               }
               System.out.println(s1.size());
        }


}
