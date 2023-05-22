public class insertionSort {
    public static void selection_Sort(int arr[]){
        for( int i =0;i<arr.length-1;i++){
            int min = i;
            for(int j = i+1; j<arr.length-1;j++){
                if(arr[min]>arr[j]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }
    public static void main(String[] args) {
        int arr[] = {8,6,2,4,3,1};
    }
}
