class Queue{
    static int arr[];
    static int rear;
    static int front;
    static int size;
    Queue(int size){
        arr=new int[size];
        this.size=size;
        rear=front=0;
    }
    // method to add element
    static void Enqueue(int data){
        if(rear==size){
            System.out.println("Queue is Full");
        }
        arr[rear]=data;
        rear++;
    }
    static void Dequeue(){
        if(rear==front){
            System.out.println("Queue is Empty");
        }
        System.out.println("Deleted Element is:"+arr[0]);
        for(int i=0;i<rear-1;i++){
            arr[i]=arr[i+1];
        }
        if(rear<size){
            arr[0]=0;
        }
        rear--;
    }
    static void display(){
        for(int i=front;i<rear;i++){
            System.out.print("<--"+arr[i]);
        }
    }
}
public class Queue1{
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.display();
        System.out.println();
        q.Enqueue(12);
        q.Enqueue(13);
        q.Enqueue(14);
        q.Enqueue(15);
        q.display();
        System.out.println();
        q.Dequeue();
        System.out.println();
        q.display();
    }
}