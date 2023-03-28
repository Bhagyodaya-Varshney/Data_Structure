public class n_to_5 {
    public static void main(String[] args) {
        print(4);
    }
    static void print(int n){
        if(n==0)
         return;
        System.out.print(n+" ");
        print(n-1);
    }
}
