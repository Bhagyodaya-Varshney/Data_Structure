class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class add_last{
    static Node addlast(Node head,int data){
        Node temp = head;
        Node newnode = new Node(data);
        if(temp==null){
            head = newnode;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }

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
        Node head=null;
        head=addlast(head,15);
        head=addlast(head,16);
        head=addlast(head,18);
        Display(head);
        
    }
}