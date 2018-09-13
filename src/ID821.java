import java.util.Arrays;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/shortest-distance-to-a-character/description/
 * @author: Majpyi
 * @create: 2018-05-03 09:49
 **/
public class ID821 {
    public static int[] shortestToChar(String S, char C) {
        char[] ch = S.toCharArray();
        int[] re1 =new int[S.length()];
        int[] re2 =new int[S.length()];
        int[] re3 =new int[S.length()];
        int pos1=0;
        int pos2=0;
        int tag=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]==C){
                int j=i-1;
                int num=1;
                while(j>=0&&ch[j]!=C){
                    re1[j]=num;
                    num++;
                    j--;
                }
                if(ch[i]==C && tag==0){
                    pos1=i;
                    tag=1;
                }
                pos2=i;
            }
        }
        re3=re1.clone();
        for(int i=0;i<ch.length;i++){
            if(ch[i]==C){
                int j=i+1;
                int num=1;
                while(j<ch.length&&ch[j]!=C){
                    re2[j]=num;
                    num++;
                    j++;
                }
            }
        }

        for(int i=pos1;i<pos2;i++){
            if(re1[i]>re2[i]) re3[i]=re2[i];
            else re3[i]=re1[i];
        }
        // 其中是有特例存在的,不一定对每个点都选择取小的那个
        for(int i =pos2;i<ch.length;i++){
            re3[i]=re2[i];
        }
        System.out.println(Arrays.toString(re1));
        System.out.println(Arrays.toString(re2));
        return re3;
    }


    public static void main(String[] args) {
       String S = "loveleetcode";char C = 'e';
       String S1 = "aaba";char C1 = 'b';
        System.out.println( Arrays.toString(shortestToChar(S1,C1)) );

    }
}
