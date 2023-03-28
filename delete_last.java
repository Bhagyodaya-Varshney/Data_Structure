class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class delete_last {
    static Node creation(Node head,int data){
        Node temp=head;
        Node newnode = new Node(data);
        if(temp==null){
            head=newnode;
        }
        else{
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next=newnode;
        }
        return head;
    }
    static Node delLast(Node head){
        Node temp = head;
        while(temp.next!=null){
            if(temp.next.next==null){
                temp.next=null;
            }
            temp=temp.next;
        }
        return head;
    }
    static void Display(Node linkedlist){
        Node temp = linkedlist;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node head = null;
        head = creation(head, 15);
        head = creation(head, 19);
        head = creation(head, 18);
        head = creation(head, 14);
        Display(head);
        head = delLast(head);
        Display(head);
        
    }
}
