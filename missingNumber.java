public class missingNumber {
    public int missingNumber(int[] nums) {
        //  int sum =0;
        //  int n = nums.length;
        //  for(int i=0;i<nums.length;i++){
        //     sum +=nums[i];
        //  }
        //     int actualsum = (n*(n+1))/2;
        //     return actualsum-sum;
        // }

        int xor=0;
        int n= nums.length;
        for(int i =0;i<=n;i++){
            xor ^=i;
        }
        for(int num : nums){
            xor^=num;
        }
        return xor;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        missingNumber mn = new missingNumber();
        System.out.println(mn.missingNumber(nums));
    }
}
