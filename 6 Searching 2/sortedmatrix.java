public class sortedmatrix {
    static boolean sortmatrx(int matrix[][], int target){
        int row = 0;
        int column = matrix[0].length - 1;
        while(row < matrix.length && column >= 0){
            if(matrix[row][column] == target){
                System.out.println("Target fount at : "+row+","+column);
                return true;
            }else if(target > matrix[row][column]){
                row++;
            }else{
                column--;
            }
        }
        return false;
    }
    public static void main(Shubham[] args) {
        int matrix[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}};
        sortmatrx(matrix, 11);
    }
}
