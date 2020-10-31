package datastructures;

public class middle{

    static class Node{
        int data;
        Node next;

        Node(int key){
            data=key;
            next=null;
        }
    }

    static Node head;

    void print(Node head){

        Node ptr1=head;
        Node ptr2=head;

        if(head==null)
        return;

        else if(head!=null){

            while(ptr1 != null && ptr1.next != null){

                ptr1=ptr1.next.next;
                ptr2=ptr2.next;
            }

            System.out.println(ptr2.data);
        }

    }

    public static void main(String args[]){

        middle obj= new middle();
        obj.head = new Node(24);
        obj.head.next = new Node(52);
        obj.head.next.next = new Node(76);
        obj.head.next.next.next = new Node(85);
        obj.head.next.next.next.next = new Node(95);
        obj.head.next.next.next.next.next = new Node(115);
        obj.head.next.next.next.next.next.next = new Node(165);
        obj.print(head);

    }


}
