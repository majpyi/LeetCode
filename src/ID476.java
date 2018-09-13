/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/number-complement/description/
 * @author: Majpyi
 * @create: 2018-05-07 16:31
 **/
public class ID476 {
    public static int findComplement(int num) {
        char[] arr = Integer.toBinaryString(num).toCharArray();
//        int x =Integer.bitCount(num);
//        System.out.println(arr);
//        System.out.println(x);
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='0') arr[i]='1';
            else arr[i]='0';
        }
//        System.out.println(arr);
        return Integer.valueOf(new String(arr),2);
    }

    public static void main(String[] args) {
        System.out.println(findComplement(1));
    }
}
