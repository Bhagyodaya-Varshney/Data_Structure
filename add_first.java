class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class add_first {
    static Node addfirst(Node head ,int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
        return head;
    }
    static void Display(Node linkedlist){
        Node temp = linkedlist;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static void main(String[] args) {
        Node head = null;//LL is empty
        head = addfirst(head, 15);
        head = addfirst(head, 17);
        head = addfirst(head, 16);
        head = addfirst(head, 14);
        head = addfirst(head, 113);
        head = addfirst(head, 100);
        Display(head);

    }
}
