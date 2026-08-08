public class matrix {
    static boolean matrix(int matrix[][], int target){
        int row = 0;
        int column = matrix.length - 1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                System.out.println("target found at : "+row+","+column);
                return true;
            }else if(matrix[row][column] > target){
                column --;
            }else{
                row++;
            }
        }
        return false;
    }
    public static void main(Shubham[] args) {
        int matrix[][] = {{10,20,30,40},
                          {11,21,31,41},
                          {12,22,32,42},
                          {14,24,34,44}};
        matrix(matrix,31);
    }
}
