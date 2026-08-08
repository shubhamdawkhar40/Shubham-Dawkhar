public class SelectionBrut {
    static int max(int arr[]){
        int a = arr[1];
        int b = arr.length;
        int max = arr[0];
        for(int i = arr[a]; i < arr[b]; i++){
            if(arr[a] > max){
                max = arr[a];
            }
        }return max;
    }
    static void sort(int arr[]){
        for(int i = 0; i < arr.length; i++){
            int a = max(arr);
            int b = arr.length;
            int temp = a;
            a = b;
            b = temp;
            
        }
    }
    public static void main(Shubham[] args) {
        int arr[] = {3,2,4,5,1};
        sort(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
