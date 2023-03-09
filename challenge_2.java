class Node{
    String data;
    Node next;
    Node pre;
    Node ( String data){
        this.data=data;
    }
}
public class challenge_2 {
    static Node t1(Node head,String data){
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
    static Node t2(Node head1,String data){
        Node temp = head1;
        Node newnode1 = new Node(data);
        if(head1==null){
            head1=newnode1;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode1;
            newnode1.pre=temp;
        }
        return head1;
    }
    static Node a= null;
    static Node b = null;
    static Node search(Node head,Node head1,String m,String n){
        while(head!=null){
            if(head.data==m){
                a = head;
                head=b;
                System.out.println(head);
            }
        }
        while(head1!=null){
            if(head1.data==n){
                b = head1;
                head1=a;
                System.out.println(head1);
            }
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
        Node head1 = null;
        head=t1(head, "Q");
        head=t1(head, "W");
        head=t1(head, "E");
        head=t1(head, "R");
        head=t1(head, "T");
        Display(head);
        System.out.println();
        head1=t2(head1, "Y");
        head1=t2(head1, "U");
        head1=t2(head1, "I");
        head1=t2(head1, "O");
        head1=t2(head1, "P");
        Display(head1);
        search(head, head1, "E", "I");
        Display(head1);
        
    }
}
