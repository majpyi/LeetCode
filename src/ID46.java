import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/ID46/description/
 * @author: Majpyi
 * @create: 2018-04-12 18:30
 **/
public class ID46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result =new LinkedList<>();
        traceback(nums,new ArrayList<>(),0,result);
        return result;
    }
    public List<List<Integer>>traceback(int []nums, ArrayList list,int start,List<List<Integer>> result)
    {
        if(list.size()==nums.length) {
            result.add(new ArrayList<>(list));
        }
        for(int i=start ;i<nums.length;i++)
        {
            if(list.contains(nums[i])) continue;
            list.add(nums[i]);
            traceback(nums,list,0,result);
            list.remove(list.size()-1);
        }
        return result;
    }

    public static void main(String[] args) {
        ID46 a =new ID46();
        int[] b ={1,2,3};
        System.out.println(a.permute(b));
    }
}
