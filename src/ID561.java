import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/array-partition-i/description/
 * @author: Majpyi
 * @create: 2018-05-03 09:33
 **/
public class ID561 {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i+=2){
            sum+=nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] a ={1,4,3,2};
        System.out.println(arrayPairSum(a));
    }
}
