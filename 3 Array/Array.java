public class Array {
    public static void main(Shubham[] args) {
        // int[] ros = new int[5];
        // ros[0] = 11;
        // System.out.println(ros[0]);
        int[][] arr = {{1,2,3,4},
                      {5,6},
                      {7,8,9}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }    
}
