import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class Circular_Queue_LL{
    static Node head,tail=null;
    static Node enqueue(Node head1){
        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the data:");
        int d2 = dc.nextInt();
        Node newLL = new Node(d2);
        if(tail==null){
            tail=head=newLL;
            return null;
        }
        tail.next=newLL;
        tail=newLL;

        return head;
    }
    static void dequeue(){
        if(head==null && tail==null){
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Deleted element is:"+head.data);
        if(head==tail)
            tail=null;
        head=head.next;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print("<--"+"|"+temp.data+"|"+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head1 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Queue:");
        int d1 = sc.nextInt();
        for(int i =0;i<d1;i++){
            head1=enqueue(head1);
        }
        display(head);
        System.out.println();
        dequeue();
        dequeue();
        display(head);
        head1=enqueue(head1);
        head1=enqueue(head1);
        System.out.println();
        display(head);
        
    }
}