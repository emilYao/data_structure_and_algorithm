public class DoubleLinkList {
    private Node tail, head;

    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data = data;

        }
    }

    void insertElement(int value){
        Node newNode = new Node(value);
        if (head == null){
            head = tail = newNode;
            tail.next = head.prev = null;
        }else{
            Node temNode = tail;
            tail.next = newNode;
            tail = newNode;
            tail.prev = temNode;
            tail.next = null;
        }
    }

    void displayElement(){
        if (head == null ){
            System.out.println("No element in the linked list");
        }else{

            Node n1 = head;

            do{
                System.out.println(n1.data);
                n1 = n1.next;
            }while(n1 != null);
        }
    }
    public static void main(String[] args){
        DoubleLinkList d1 = new DoubleLinkList();
        d1.insertElement(3);
        d1.insertElement(8);
        d1.insertElement(2);
        d1.displayElement();
    }
}
