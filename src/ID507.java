import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/perfect-number/description/
 * @author: Majpyi
 * @create: 2018-05-01 21:20
 **/
public class ID507 {
    public  static boolean checkPerfectNumber(int num) {
        if(num==1) return false;
        List<Integer> re =new ArrayList<>();
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
                re.add(i);
                re.add(num/i);
            }
        }
        int sum=0;
        for(Integer a : re){
            if(sum>num)
                break;
            sum+=a;
        }
        System.out.println(re);
        return (sum+1)==num;
    }

    public static void main(String[] args) {
        System.out.println(checkPerfectNumber(1));
    }
}
