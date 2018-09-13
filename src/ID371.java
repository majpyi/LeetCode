/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/sum-of-two-integers/description/
 * @author: Majpyi
 * @create: 2018-04-17 18:44
 **/
public class ID371 {
    public int getSum(int a, int b) {
        int c,d;
        while(a!=0){
            c = (a & b)<<1;
            d = (a ^ b);
            a = c;
            b = d;
        }
        return a+b;
    }

    public static void main(String[] args) {
        ID371 demo = new ID371();
        System.out.println(demo.getSum(22,33));
    }
}
