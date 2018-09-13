import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/climbing-stairs/description/
 * @author: Majpyi
 * @create: 2018-04-11 14:50
 **/

public class ID70 {
    public int[] resultlist()
    {
        int[] result = new int[1024];
        result[1]=1;
        result[2]=2;
//        for(int i=3;i<=1024;i++)     超过了数组的范围
        for(int i=3;i<=1023;i++)
        {
//            result[i]=result[1]+result[2];        书写错误
            result[i]=result[i-1]+result[i-2];
        }
        return result;
    }
    public int climbStairs(int n) {
        return resultlist()[n];
    }
}

/*
递归的形式实现
 */

 class ClimbStairs {
    static int s = 1;
    public static int[] steps = new int[10];

    public static void main(String[] args){
        System.out.println("请输入台阶数：");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        tryStep(n);
    }
    static void tryStep(int n){ // 爬n级楼梯
        for (int i = 1; i <= 2; i++){
            // 对于每次爬有两次尝试，一次爬1级或者一次爬2级
            if (n < i)
                break;
            steps[s++] = i; // 一步走了i级台阶
            n -= i; //缩小问题的规模
            if (n == 0) {
                for (int j = 1; j < s; j++){
                    System.out.print("第"+ j + "步走了" + steps[j]
                            + "级台阶 ");
                }
                System.out.println();
            } else {
                tryStep(n);
            }
            n += i;
            steps[s--] = 0;
        }
    }
}

//http://chen-tao.github.io/2017/01/26/about-dfs/
//https://leetcode.com/problems/subsets/
//深搜 框架解法
 class Solution {

    public static List<List<Integer>> ans = new ArrayList<List<Integer>>();

    //public static int[] path = new int[100];

    public static boolean[] v = new boolean[100];

    public static void robot(int idx, int[] nums){
        if(idx >= nums.length){
            List<Integer> tmp = new ArrayList<Integer>();
            for(int i=0;i<nums.length;i++){
                if(v[i]){
                    tmp.add(nums[i]);
                }
            }
            ans.add(tmp);
            return;
        }
        //不选
        v[idx] = false;
        robot(idx+1,nums);
        //选
        v[idx] = true;
        robot(idx+1,nums);
    }

    public List<List<Integer>> subsets(int[] nums) {
        ans.clear();
        //先排序，然后dfs每个元素选或者不选，最后叶子节点就是所有解
        //Arrays.sort(nums);
        int n = nums.length;
        //选择排序 冒泡是交换相邻的2个元素
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i] > nums[j]){
                    int t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }

        robot(0, nums);
        return ans;
    }
}