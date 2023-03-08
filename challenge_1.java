class Node{
    int data;
    Node pre;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class challenge_1 {
    static Node t1(Node head,int data){
        Node temp = head;
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.pre=temp;
        }
        return head;
    }
    static Node t2(Node head,int data){
        Node temp = head;
        Node newnode = new Node(data);
        if(head==null){
            head=newnode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.pre=temp;
        }
        return head;
    }
    static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("Null");
    }
    public static void main(String[] args) {
        Node head = null;
        head=t1(head, 1);
        head=t1(head, 2);
        head=t1(head, 3);
        head=t1(head, 4);
        head=t1(head, 5);
        Display(head);
        System.out.println();
        head=t2(head, 6);
        head=t2(head, 7);
        head=t2(head, 8);
        head=t2(head, 9);
        head=t2(head,10);
        Display(head);
        
    }
}
