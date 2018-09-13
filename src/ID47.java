import java.util.*;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/permutations-ii/description/
 * @author: Majpyi
 * @create: 2018-04-12 19:11
 **/
class permutations_II {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> result =new HashSet<>();
        traceback(nums,new ArrayList<>(),0,result,new boolean[nums.length]);
        return new ArrayList(result);
    }
    public HashSet<List<Integer>>traceback(int[] nums, ArrayList list,int start,HashSet<List<Integer>> result,boolean [] used)
    {
        if(list.size()==nums.length) {
            result.add(new ArrayList<>(list));
            return result;
        }
        for(int i=start ;i<nums.length;i++)
        {
//            if(i > start && nums[i] == nums[i-1]) i++;
//            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
//            used[i] = true;
            list.add(nums[i]);
            traceback(nums,list,0,result,used);
//            used[i] = false;
            list.remove(list.size()-1);
        }
        return result;
    }
    public static void main(String[] args) {
        permutations_II a =new permutations_II();
        int[] b ={1,2,1};
        System.out.println(a.permuteUnique(b));
    }
}




// 对递归的理解
 class permutations_II2 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result =new LinkedList<>();
        traceback(nums,new ArrayList<>(),0,result,new boolean[nums.length]);
        return new ArrayList(result);
    }
    public List<List<Integer>>traceback(int[] nums, ArrayList list,int start,List<List<Integer>> result,boolean [] used)
    {

//        if(list.size()==nums.length) {
        if(list.size()>=3) {
            num++;
            result.add(new ArrayList<>(list));
            return result;
        }
        for(int i=start ;i<nums.length;i++)
        {
//            if(i > start && nums[i] == nums[i-1]) i++;
//            if(used[i] || i > 0 && nums[i] == nums[i-1] && !used[i - 1]) continue;
//            used[i] = true;
            list.add(nums[i]);
            traceback(nums,list,0,result,used);
//            used[i] = false;
//            list.remove(list.size()-1);
        }
        return result;
    }
     static int num=0;

     public static void main(String[] args) {
        permutations_II2 a =new permutations_II2();
        int[] b ={1,2,3};
        System.out.println(a.permuteUnique(b));
        System.out.println(num);
    }
}