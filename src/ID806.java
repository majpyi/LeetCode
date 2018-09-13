import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/number-of-lines-to-write-string/description/
 * @author: Majpyi
 * @create: 2018-05-08 20:56
 **/
public class ID806 {
    public static int[] numberOfLines(int[] widths, String S) {
        char[] ch =S.toCharArray();
        int num=0;
        int sum=100;
        for(char x : ch){
            num+=widths[x-'a'];
            if(num>sum){
                num=sum+widths[x-'a'];
                sum+=100;
            }

        }
        int[] re={num/100+1,num%100};
        return re;
    }

    public static void main(String[] args) {
//        int[] widths = {10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        String S = "abcdefghijklmnopqrstuvwxyz";
        int[] widths = {4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10};
        S = "bbbcccdddaaa";
        System.out.println(Arrays.toString(numberOfLines(widths,S)));
    }
}
