import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/two-sum/description/
 * @author: Majpyi
 * @create: 2018-08-24 16:19
 **/

public class ID1 {

    public static int[] twoSum(int[] nums, int target) {
        int[] copy = nums.clone();
        Arrays.sort(nums);
//        System.out.println(Arrays.toString(nums));
        int[] re = {0,0};
        for (int i=0;i<nums.length;i++){
            for(int k=0;k<nums.length;k++){
                if(copy[k]==nums[i]){
                    re[0]=k;
                    copy[k] = -9999;
                    break;
                }
            }
//            re[0] = i;
            int remain = target-nums[i];
            for(int j=nums.length-1;j>i;j--){
                if(nums[j]==remain){
//                    System.out.println(remain+" "+nums[j]+" "+i+" "+nums[i]);
//                    re[1]=j;
                    for(int k=0;k<nums.length;k++){
                        if(copy[k]==nums[j]){
                            re[1]=k;
                            break;
                        }
                    }
                    return  re;
                }
            }
        }
        return re;
    }
    
    public static void main(String[] args) {
        int[] a = {3,2,3};
        System.out.println(Arrays.toString(twoSum(a,6) ) );
    }
    

}
