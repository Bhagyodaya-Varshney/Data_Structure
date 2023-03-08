public class find_ele {
    public static void main(String[] args) {
        int []arr = new int[4];
        arr[0]=1;
        arr[1]=2;
        arr[2]=3;
        arr[3]=4;

        int a = 4;
        int in =-1;
        for(int i =0; i<arr.length;i++){
            if(arr[i]==a){
                in=i;
            }
        }
        System.out.println(in);
    }
}
