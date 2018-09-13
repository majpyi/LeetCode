/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/excel-sheet-column-number/description/
 * @author: Majpyi
 * @create: 2018-04-17 19:04
 **/
public class ID171 {
    public int titleToNumber(String s) {
        char[] c =s.toCharArray();
        int sum=0;
        int num=c[c.length-1]-'A'+1;
        for(int i=0;i<c.length-1;i++)
        {
            sum+=(c[i]-'A'+1);
            sum*=26;
        }
        return sum+num;
    }

    public static void main(String[] args) {
        ID171 demo = new  ID171();
        System.out.println(demo.titleToNumber("AAA"));
    }
}
