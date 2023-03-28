import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
public class delete_first {
    static Node creation(Node head , int data){
        Node temp = head;
        Node newnode = new Node(data);
        if(temp == null){
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
    static void Display(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    static Node deletefirst(Node head){
        Node temp = head;
        temp=temp.next;
        head = temp;
        return head;
    }
    public static void main(String[] args) {
        Node head = null;
        int press;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Your data:");
            int data = sc.nextInt();
            head = creation(head, data);
            System.out.println("press 1 for More data");
            press = sc.nextInt();
        }
        while(press == 1);
        Display(head);
        head=deletefirst(head);
        Display(head);
        
    }
}
