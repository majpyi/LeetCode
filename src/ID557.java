/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/reverse-words-in-a-string-iii/description/
 * @author: Majpyi
 * @create: 2018-05-09 09:30
 **/
public class ID557 {
    public static String reverseWords(String s) {
        String[] a = s.split(" ");
        StringBuffer re =new StringBuffer();
        for (String x : a) {
            StringBuffer sb = new StringBuffer(x);
            re.append(sb.reverse()).append(" ");
        }
        return new String(re).substring(0,re.length()-1);
    }

    public static void main(String[] args) {
        System.out.println("Let's take LeetCode contest");
        System.out.println(reverseWords("Let's take LeetCode contest"));
    }
}
