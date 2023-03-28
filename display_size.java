public class display_size{
    public void display() {
        Node t = head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        
    }
}