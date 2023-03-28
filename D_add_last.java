class Node{
    int data;
    Node pre;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class D_add_last {
    static Node add(Node head,int data){
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
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head=add(head, 16);
        head=add(head, 14);
        head=add(head, 17);
        head=add(head, 15);
        Display(head);
        
    }
}
