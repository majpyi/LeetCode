/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/reverse-string/description/
 * @author: Majpyi
 * @create: 2018-04-17 16:33
 **/
public class ID344 {
    public String reverseString(String s) {
        char[] a =s.toCharArray();
        char b;
        for(int i=0;i<a.length/2;i++)
        {
            b=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i] =b;
        }
        return new String(a);
    }
    public String reverseString_1(String s) {
//        StringBuffer a =new StringBuffer(s);
//        a.reverse();
//        return new String(a);
        return new StringBuffer(s).reverse().toString();
    }

    public static void main(String[] args) {
        ID344 demo =new ID344();
        System.out.println(demo.reverseString("hello"));
        System.out.println(demo.reverseString_1("hello"));
    }
}
