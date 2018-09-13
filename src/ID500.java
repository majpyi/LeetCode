import java.util.*;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/keyboard-row/description/
 * @author: Majpyi
 * @create: 2018-05-09 09:48
 **/
public class ID500 {
    public String[] findWords(String[] words) {

        Set<Character>[] rows = new HashSet[3];

        for(int i=0; i < rows.length; i++)
            rows[i] = new HashSet<>();
        for(char ch : "qwertyuiop".toCharArray())
            rows[0].add(ch);
        for(char ch : "asdfghjkl".toCharArray())
            rows[1].add(ch);
        for(char ch : "zxcvbnm".toCharArray())
            rows[2].add(ch);

        List<String> res = new LinkedList<>();
        for(Set<Character> row : rows)
            for(String w : words){
                res.add(w);
                for(char ch : w.toCharArray())
                    if(!row.contains(Character.toLowerCase(ch))){
                        res.remove(res.size()-1);
                        break;
                    }
            }
        return res.toArray(new String[0]);
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println(Arrays.toString(sc.nextLine().toCharArray()) );
    }
}
