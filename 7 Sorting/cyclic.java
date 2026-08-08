public class cyclic {
    static void swap(int arr[], int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void cyclsort(int arr[]){
        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }
    }
    static void missing(int arr[]){
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j){
                System.out.println("Missing no is : "+j);
                return;
            }
        }
    }
    static void miss(int arr[]){
        for(int k = 1; k < arr.length - 1; k++){
            if(arr[k] != k + 1){
                System.out.println("Missing numbers are : "+(k + 1));
            }
        }
    }
    static void duplicate(int arr[]){
        for(int i = 0; i < arr.length; i ++){
            if(arr[i] != i+1){
                System.out.println("duplicate elements are : "+arr[i]);
            }
        }
    }
    static void error(int arr[]){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != i + 1 && arr[i] != i){
                System.out.println(arr[i]+" is duplicate & "+i+" is missing");
            }
        }
    }
    static void missingpstv(int arr[]){
        for(int j = 0; j < arr.length; j++){
            if(arr[j] != j && j % 2 == 0){
                System.out.println("1st missing +ve  no is : "+j);
                return;
            }
        }
    }
    public static void main(Shubham[] args) {
        int arr[] = {4,3,2,7,8,2,3,1};
        cyclsort(arr);

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        missing(arr);
    }
}
