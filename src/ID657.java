/**
 * @program: LeetCode
 * @description: https://leetcode-cn.com/problems/judge-route-circle/description/
 * @author: Majpyi
 * @create: 2018-04-27 16:40
 **/
public class ID657 {
    public boolean judgeCircle(String moves) {
        char a[]=moves.toCharArray();
        int x=0;
        int y=0;
        for (char c : a){
            if(c=='R'){
                x++;
            }
            if(c=='L'){
                x--;
            }
            if(c=='U'){
                y++;
            }
            if(c=='D'){
                y--;
            }
        }
        if(x==0&&y==0) return true;
        else return false;

    }
}
