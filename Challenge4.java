import java.util.*;
class Node{
    Node next;
    String data;
    Node(String data){
        this.data=data;
    }
}
class Challenge4 {
    static int c=0;
    Node remo=null;
    Node push(Node top,String data){
        c++;
    Node n=new Node(data);
    if(top!=null){
        n.next=top;
        top=n;}
        else{
            top=n;
        }
    return top;
}
void pushBogie(Node top){
    if(remo==null){
remo=top;
    }
    else{
        top.next=remo;
        remo=top;
    }
}

Node pop(Node top){
    Node temp=top;
    if(top!=null){
        System.out.println("Compartment "+top.data+" detached");
        top=top.next;
        temp.next=null;
        pushBogie(temp);
    }
    else{
System.out.println("stack overflow");
    }
    return top;
}
void print(Node top){
while(top!=null){
System.out.println(top.data);
top=top.next;
}}
void d(){
    Node temp=remo;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
        }}

Node finalOP(Node top){
  
    remo=remo.next;
    while(remo!=null){
        Node temp=remo; 
        System.out.println("Compartment"+remo.data+" attached");
        remo=remo.next;
        temp.next=top;
        top=temp;
    }
   
   return top;
}
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        Node myStack=null;
        Challenge4 a=new Challenge4(); 
        System.out.print("enter size of train : ");
        int size=sc.nextInt();
        System.out.println();
        for(int i=1; i<=size; i++){
            System.out.print("enter Compartment "+i+" : ");
            String data=sc.next();
            myStack=a.push(myStack, data);
        }
        System.out.println();
        System.out.print("enter position of Compartment which you detached : ");
        int pos=sc.nextInt();
        System.out.println();
        System.out.println("Compartment is detaching.....");
        System.out.println();      
        for(int i=c;i>=pos;i--){
           
            myStack=a.pop(myStack);
        }
        System.out.println();
        System.out.println("Compartment is attaching....."); 
        System.out.println();
       myStack=a.finalOP(myStack);
       System.out.println();
       System.out.println("your train after processing");
       
            System.out.println();  
       a.print(myStack);
    }
   }