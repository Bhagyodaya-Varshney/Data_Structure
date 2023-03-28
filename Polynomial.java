class Node{
    int data;
    int deg;
    Node next;
    Node(int data,int deg){
        this.data = data;
        this.deg = deg;
    }
}
public class Polynomial {
    static Node add(Node head , int data,int deg){
        Node temp=head;
        Node n = new Node(data, deg);
        if(head==null){
            head=n;
        }
        else{
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
        return head;
    }
    static Node newll = new Node(0,0);
    static void cmp(Node head,Node head1){
        Node temp=head;
        Node temp1=head1;
        while(temp!=null || temp1!=null){
            if(temp==null){
                newll.next=temp1;
                break;
            }
            else if(temp1 == null){
                newll.next = temp;
                break;
            }
            else if(temp.deg==temp1.deg){
                newll.next= new Node((temp.data+temp1.data), temp.deg);
                temp=temp.next;
                temp1=temp1.next;
            }
            else if (temp.deg > temp1.deg) {
                newll.next = new Node(temp.data, temp.deg);
                temp = temp.next;
            }
            else if ((temp.deg < temp1.deg)) {
                newll.next = new Node(temp1.data, temp1.deg);
                temp1 = temp1.next;
            }
            newll=newll.next;
        }
    }
    static void disp(Node newll){
        Node temp=newll;
        while(temp!=null){
            System.out.print(temp.data+"x^"+temp.deg+" +");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head=null;
        Node head1=null;
        head=add(head, 7, 2);
        head=add(head, 8, 1);
        head=add(head, 9, 0);
        head1=add(head1, 4, 1);
        head1=add(head1, 5, 0);
        head1=add(head1, 6, 2);
        System.out.println();
        cmp(head, head1);
        disp(newll);
        
    }
}
