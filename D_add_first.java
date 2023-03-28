class xyz{
    int data;
    xyz pre;
    xyz next;
    xyz(int data){
        this.data=data;
    }
}
public class D_add_first {
    static xyz add(xyz head,int data){
        xyz newnode= new xyz(data);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head.pre=newnode;
            head=newnode;
        }
        return head;
    }
    static void Display(xyz head){
        xyz temp=head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        xyz head = null;
        head=add(head, 15);
        head=add(head, 19);
        head=add(head, 17);
        Display(head);
        
    }
}
