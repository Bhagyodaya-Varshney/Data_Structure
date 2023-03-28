class Queue{
    static int front , rear;
    static int size;
    static int arr[];
    Queue(int size){
        arr= new int[size];
        front = rear = -1;
        this.size=size;
    }
    static void enqueue(int data){
        if((rear+1)%size==front){
            System.out.println("Circular Queue is Full");
        }
        if(front==-1){
            front=0;
        }
        rear=(rear+1)%size;
        arr[rear]=data;
    }
    static void dequeue(){
        System.out.println(arr[front]);;
        if(rear==front){
            rear=front=-1;
        }
        else{
            front=(front+1)%size;
        }
    }
    static void display(){
        for(int i=0;i<arr.length-1;i++){
            System.out.print("<--"+arr[i]);
        }
    }
}
public class Circular_Queue {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        q.display();
        System.out.println();
        q.enqueue(12);
        q.enqueue(13);
        q.enqueue(14);
        q.display();
        System.out.println();
        q.dequeue();
        System.out.println();
        q.enqueue(20);
        System.out.println();
        q.display();      
    }
}
