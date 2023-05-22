public class reverse_with_2_pointer {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int t = arr[i];
            arr[i]=arr[j];
            arr[j]=t;
            i++;
            j--;
        }
        for(int k:arr){
            System.out.println(k+" ");
        }
    }
}
