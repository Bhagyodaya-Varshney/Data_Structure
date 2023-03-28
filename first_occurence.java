class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class first_occurence {
    static Node creation(Node head,int data){
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
    static void firstoccurence(Node head,int data){
        Node temp = head;
        int ctr=0;
        while(temp!=null){
            ctr++;
            if(temp.data==data){
                System.out.println(ctr);
                break;
            }
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = creation(head,20);
        head = creation(head,15);
        head = creation(head,14);
        head = creation(head,15);
        firstoccurence(head,15);
        
    }
}
