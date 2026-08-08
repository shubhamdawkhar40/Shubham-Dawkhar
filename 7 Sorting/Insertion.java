public class Insertion {
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void inst(int arr[]){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i + 1; j > 0; j--){
                if(arr[j] < arr[j - 1]){
                    swap(arr, j, j-1);
                }
            }
        }
    }
    public static void main(Shubham[] args) {
        int arr[] = {8,11,6,1,12};
        inst(arr);
        System.out.print("{");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("}");
    }
}
