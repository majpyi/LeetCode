import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/unique-morse-code-words/description/
 * @author: Majpyi
 * @create: 2018-04-16 16:44
 **/
public class ID804 {
    String[] code ={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    HashMap hm =new HashMap();
    HashSet set =new HashSet();
    public int uniqueMorseRepresentations(String[] words) {
        for(int i=0;i<26;i++)
        {
            hm.put((char)(i+'a'),code[i]);   //   不这样样的话,传入的是数字,不是字符
        }
        for( Object s : hm.keySet())
        {
//            System.out.println(s+":"+hm.get(s));
        }
        for(int i =0;i<words.length;i++)
        {
            char[] a =words[i].toCharArray();
//            System.out.print(a);
//            System.out.println();
            StringBuffer al = new StringBuffer();
//            String al =new String();
//            ArrayList al =new ArrayList();
            for(int j=0;j<a.length;j++)
            {
//                System.out.println(hm);
//                al.concat(hm.get(a[j]).toString());
//                System.out.println(hm.get(a[j]).toString());
//                al.add(hm.get(a[j]).toString());
                al.append(hm.get(a[j]));
//                System.out.println(a[j]);
//                System.out.println(hm.get(a[j]));
            }
            set.add(new String(al));     //  直接使用 StringBuffer 是不可行的,因为没有重新 object 的 equal 方法.
        }
//        System.out.println(set);

        for(Object i : set)
        {
            System.out.println(i);
        }
       return set.size();
    }


    public static void main(String[] args) {
        ID804 a =new ID804();
        String[] b ={"gin", "zen", "gig", "msg"};
        System.out.println(a.uniqueMorseRepresentations(b));
    }
}

//class StringBuffer extends Object
//{
//    public boolean equals(Object obj)
//    {
//        if(this.toString()==obj.toString())
//        {
//            return true;
//        }
//        return false;
//    }
//}