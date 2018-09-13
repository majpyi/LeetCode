/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/jewels-and-stones/description/
 * @author: Majpyi
 * @create: 2018-04-12 22:24
 **/
class ID771 {
    public int numJewelsInStones(String J, String S) {
        int num=0;
        char[] jj = J.toCharArray();
        char[] ss = S.toCharArray();
        for(int i=0;i<jj.length;i++)
        {
            for(int j=0;j<ss.length;j++)
            {
                if(jj[i]==ss[j])
                {
                    num++;
                }
            }
        }
        return num;
    }
}
