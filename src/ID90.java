/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/subsets-ii/description/
 * @author: Majpyi
 * @create: 2018-04-11 15:39
 **/
import java.util.*;

class subsetsII {

    public static void main(String[] args) {
        subsetsII re = new subsetsII();
        Scanner x = new Scanner(System.in);

        while(x.hasNext()){
//            result.clear();   //    因为是在静态的 static 中的需要使用 static 的成员,并且每次需要进行清空
            String[] xx =x.nextLine().split(",");
            int[] in =new int[xx.length];
            for(int i=0;i<xx.length;i++)
            {
                in[i]=Integer.parseInt(xx[i]);
            }
            System.out.println(re.subsets(in));
//            re.subsets(in);
//            System.out.println(result);
//            int[] hello ={1,2,3};
//            System.out.println(re.subsets(hello));
        }
    }

    HashSet<List<Integer>> result = new HashSet<List<Integer>>();

    public HashSet<List<Integer>> subsets(int[] nums)
    {
        ArrayList list = new ArrayList();
        backtrace(nums,0,list);
        return result;
    }
    public void backtrace(int[] nums, int start, ArrayList list) {
        if (start > nums.length)
            return;
        if (start <= nums.length)
        {
//            result.add(list);
            result.add(new ArrayList(list));
        }
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            backtrace(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
//        System.out.println(result);
    }
}

 class subsetsII2 {

    public static void main(String[] args) {
        subsetsII2 re = new subsetsII2();
        Scanner x = new Scanner(System.in);

        while(x.hasNext()){
            result.clear();   //    因为是在静态的 static 中的需要使用 static 的成员,并且每次需要进行清空
            String[] xx =x.nextLine().split(",");
            int[] in =new int[xx.length];
            for(int i=0;i<xx.length;i++)
            {
                in[i]=Integer.parseInt(xx[i]);
            }
            Arrays.sort(in);

            System.out.println(re.subsets(in));
//            re.subsets(in);
//            System.out.println(result);
//            int[] hello ={1,2,3};
//            System.out.println(re.subsets(hello));
        }
    }

    static List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums)
    {
        ArrayList list = new ArrayList();
        backtrace(nums,0,list);
        return result;
    }
    public void backtrace(int[] nums, int start, ArrayList list) {
        if (start > nums.length)
            return;
        if (start <= nums.length)
        {
//            result.add(list);
            result.add(new ArrayList(list));
        }
        for (int i = start; i < nums.length; i++) {
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            list.add(nums[i]);
            backtrace(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
//        System.out.println(result);
    }
}


class subsetsII3
{
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(), nums, 0);
        return list;
    }

    private void backtrack(List<List<Integer>> list, List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            if(i > start && nums[i] == nums[i-1]) continue; // skip duplicates
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    public static void main(String[] args) {
        subsetsII3 a =new subsetsII3();
        int[] b ={1,2,1};
        System.out.println(a.subsetsWithDup(b));
    }
}