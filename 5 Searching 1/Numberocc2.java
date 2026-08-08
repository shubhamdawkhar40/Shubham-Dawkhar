public class Numberocc2 {
    public static int Search(int nums[], int target, boolean findStartIndex){
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(target < nums[mid]){
                end = mid - 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
    public static void main(Shubham[] args) {
        int nums[] = {5,7,7,8,8,10};

        int firstOccurance = Search(nums, 8, true);
        int lastOccurance = Search(nums, 8, false);

        System.out.println("First coourance : "+firstOccurance);
        System.out.println("Last occurance is : "+lastOccurance);
    }
}
