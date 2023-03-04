public class bar_chart {
    public static void main(String[] args) {
        int[]arr=new int[4];
        arr[0]=4;
        arr[1]=0;
        arr[2]=7;
        arr[3]=2;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i];j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
