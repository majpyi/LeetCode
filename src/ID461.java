/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/hamming-distance/description/
 * @author: Majpyi
 * @create: 2018-04-27 16:25
 **/
public class ID461 {
    public  static int hammingDistance(int x, int y) {
        String z;
//        String b1 = Integer.toBinaryString(x);
//        String b2 = Integer.toBinaryString(y);
        int num=0;
        z =Integer.toBinaryString(x^y);
        System.out.println(z.toCharArray());
        for (char i :
                z.toCharArray()) {
            if(i=='1')
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }
}
