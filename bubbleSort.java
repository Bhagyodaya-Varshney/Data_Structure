public class bubbleSort{
    public static void bubble_Sort(int arr[]){
        for(int i =0;i<arr.length-1;i++){
            for(int j =0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }
            }
        }
        for(int k =0;k<arr.length;k++){
            System.out.println(arr[k]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {5,8,6,2,1};
        bubble_Sort(arr);
    }
}