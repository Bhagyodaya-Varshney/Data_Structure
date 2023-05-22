import java.util.*;
public class kth_smallest {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,0,8,12,10};
        int k=5;
        Arrays.sort(arr);
        System.out.println(arr[k+0]+" "+arr[arr.length-k]);
    }
}
