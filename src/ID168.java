/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/excel-sheet-column-title/description/
 * @author: Majpyi
 * @create: 2018-04-17 19:15
 **/
public class ID168 {
    public String convertToTitle(int n) {
        StringBuffer sb =new StringBuffer();
//        if((n/=26)!=0){
//            return String.valueOf((char)(n+'A'-1));
//        }
        while(n!=0){
            if(n % 26==0){
                sb.append('Z');
                n--;
            }
            else {
                sb.append((char) (n % 26 + 'A' -1));
            }
            n/=26;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        ID168 demo = new ID168();
//        for(int i=1;i<54;i++)
        System.out.println(demo.convertToTitle(703));
    }
}
