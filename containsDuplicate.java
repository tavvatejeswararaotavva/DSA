import java.util.HashSet;

public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<Integer>();
        for (int num : nums) {
            if (!hs.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        containsDuplicate cd = new containsDuplicate();
        System.out.println(cd.containsDuplicate(nums));
    }
}
