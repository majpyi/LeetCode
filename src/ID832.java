import java.util.Arrays;
import java.util.Collections;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/flipping-an-image/description/
 * @author: Majpyi
 * @create: 2018-05-29 19:46
 **/
public class ID832 {
    public static int[][] flipAndInvertImage(int[][] A) {
        for(int a[] : A){
            for(int i=0;i<(a.length+1)/2;i++){
//                int temp = a[i]^1;
//                a[i] = a[a.length-i-1]^1;
                int temp = ~a[i];
                a[i] = ~a[a.length-i-1];
                a[a.length-i-1] = temp;
            }
//            System.out.println(Arrays.toString(a));

        }
        return A;
    }

    public static void main(String[] args) {
        int[][] a =new int[][]{{1,1,0},{0,1,1}};
        flipAndInvertImage(a);
        for(int[] b : a){
            System.out.println(Arrays.toString(b));
        }
    }
}
