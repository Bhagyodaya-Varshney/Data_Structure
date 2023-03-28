import java.util.*;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class Stack{
    static int ctr=0;
    static int data;
    static int userAns(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Which Compartment to delete:");
        data = sc.nextInt();
        return data;
    }
    static Node DA(Node head,int data){
        Node top = Pop(head);
        DA(head, data);
        Push(top, top.data);
        return head;
    }
    static Node Push(Node head,int data){
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
    static Node Pop(Node head){
        if(head==null){
            System.out.println("Train has No Compartment");
        }
        else{
            System.out.println("Compartment No."+ctr+"Detached");
            head=head.next;
        }
        ctr--;
        return head;
    }
    static void display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print("|"+temp.data+"|"+"--->");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Node head = null;
        head = Push(head, 10);
        head = Push(head, 14);
        head = Push(head, 13);
        head = Push(head, 12);
        head = Push(head, 11);
        display(head);
        DA(head, userAns());

    }
}