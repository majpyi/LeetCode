/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/subsets/description/
 * @author: Majpyi
 * @create: 2018-04-11 14:50
 * Given a set of distinct integers, nums, return all possible subsets (the power set).
 **/
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

class subsets {

    public static void main(String[] args) {
        subsets re = new subsets();
        Scanner x = new Scanner(System.in);

        while(x.hasNext()){
            result.clear();   //    因为是在静态的 static 中的需要使用 static 的成员,并且每次需要进行清空
            String[] xx =x.nextLine().split(",");
            int[] in =new int[xx.length];
            for(int i=0;i<xx.length;i++)
            {
                in[i]=Integer.parseInt(xx[i]);
            }
            System.out.println(re.subsets(in));
//            int[] hello ={1,2,3};
//            System.out.println(re.subsets(hello));
        }
    }

    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        List list = new ArrayList();
        backtrace(nums,0,list);
        return result;
    }
    public void backtrace(int[] nums, int start, List list) {
        if (start > nums.length) {
            System.out.println(".......");//根本执行不到
            return;
        }
        if (start <= nums.length)
            result.add(new ArrayList(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtrace(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}


class subsets2
{
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}