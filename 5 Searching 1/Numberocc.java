public class Numberocc {
    public static int occurance(int nums[]){
        int target = 8;
        int mid = nums.length/2;
        if(target < mid){
            for(int i = 0; i < mid; i++){
                if(nums[i] == target){
                    System.out.println("First occurance is : "+i);
                }
            }
        }else if(target > mid){
            for(int i = mid; i <= nums.length - 1; i++){     //error possible
                if(nums[i] == target){
                    System.out.println("First occurance is : "+i);
                }
            }
        }
        return -1;
    }
    public static void main(Shubham[] args) {
        int nums[] = {5,7,7,8,8,10};
        occurance(nums);
    }
}
