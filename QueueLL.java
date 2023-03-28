class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class QueueLL {
    static Node head,tail=null;
    static Node enqueue(Node head1,int data){
        Node newLL = new Node(data);
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
    static void display(Node head1){
        Node temp = head;
        while(temp!=null){
            System.out.print("<--"+temp.data);
            temp= temp.next;
        }
    }
    public static void main(String[] args) {
        Node head1 = null;
        head1=enqueue(head, 10);
        head1=enqueue(head, 12);
        head1=enqueue(head, 13);
        head1=enqueue(head, 14);
        display(head);
        System.out.println();
        dequeue();
        dequeue();
        dequeue();
        dequeue();
        display(head);
        
    }
}
