class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class last_occurenec {
    static Node creation(Node head,int data){
        Node temp = head;
        Node newNode = new Node(data);
        if(temp == null){
            head = newNode;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    static void lastoccurenec(Node head , int data){
        Node temp = head;
        int ctr=0;
        int ls=0;
        while(temp!=null){
            ctr++;
            if(temp.data==data){
                 ls = ctr;
            }
            temp=temp.next;
        }
        System.out.println(ls);
    }
    public static void main(String[] args) {
        Node head = null;
        head = creation(head, 10);
        head = creation(head, 120);
        head = creation(head, 15);
        head = creation(head, 11);
        head = creation(head, 15);
        lastoccurenec(head, 15);
        
    }
}
