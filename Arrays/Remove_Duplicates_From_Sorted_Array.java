package Arrays;

public class Remove_Duplicates_From_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);


        for(int i = 0; i < k; i++){
            System.out.println(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums){
        int index =0;
        nums[index]=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[index]!=nums[i]){
                index++;
                nums[index]=nums[i];
            }
        }
        return index+1;
    }
}
