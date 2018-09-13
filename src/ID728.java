import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description:https://leetcode-cn.com/problems/self-dividing-numbers/description/
 * @author: Majpyi
 * @create: 2018-05-01 20:51
 **/
public class ID728 {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> re =new ArrayList<>();
        for(int i=left;i<=right;i++){
            char[] num = String.valueOf(i).toCharArray();
            re.add(i);
            for (char aNum : num) {
                if(aNum=='0')
                {
                    re.remove(new Integer(i));
                    break;
                }
                if (i % Integer.parseInt(aNum + "") != 0){
                    re.remove(new Integer(i));
//                    错误的,以为是下标
//                    re.remove(i);
                    break;
                }
            }

        }
        return re;
    }

    public static void main(String[] args) {
        ID728 a =new ID728();

        System.out.println(a.selfDividingNumbers(1,22));
    }
}
