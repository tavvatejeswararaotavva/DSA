package Arrays;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 10;
        int[] result = twoSum(arr,target);
        for(int num: result){
            System.out.print(num + " ");
        }
    }
    public static int[] twoSum(int[] arr, int target){
        HashMap<Integer, Integer> hs = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int complemnt=target-arr[i];
            if(hs.containsKey(complemnt)){
                return new int[]{hs.get(complemnt),i};
            }
            hs.put(arr[i],i);
        }
        return new int[]{-1,-1};
    }
}
