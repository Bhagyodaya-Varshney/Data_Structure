import java.util.*;
class Node{
    Node next;
    int data;
    Node(int data){
        this.data=data;
    }
}
class challenge5 {
    static int ctr = 0;
    static Node n1=null;
    static Node newLL= null;
    static Node push(Node head,int data){
        ctr++;
        Node newll = new Node(data);
        if(head==null){
            head=newll;
        }
        else{
            newll.next=head;
            head=newll;
        }
        return head;
    }
    static Node Delete(Node head,int data){
        for(int i =1;i<=data;i++){
            head=pop(head);
        }
        return head;
    }
    static Node pop(Node head){
        System.out.println("Compartment Number "+ctr+" Detached");
        if(newLL==null){
            newLL = new Node(head.data);
            newLL=newLL.next;
        }
        head=head.next;
        ctr--;
        return head;
    }
    static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
    }
    
    public static void main(String[] args) {
       Node head = null;
       head=push(head, 10);
       head=push(head, 11);
       head=push(head, 12);
       head=push(head, 13);
       head=push(head, 14);
       Display(head);
       Scanner sc = new Scanner(System.in);
       System.out.println();
       System.out.print("Enter which Compartment to delete:");
       int delcomp = sc.nextInt();
       Delete(head, delcomp);
       System.out.println();
       Display(newLL);
    }
   }