import java.util.ArrayList;
import java.util.List;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/fizz-buzz/description/
 * @author: Majpyi
 * @create: 2018-04-17 18:20
 **/
public class ID412 {
    public List<String> fizzBuzz(int n) {
        ArrayList result = new ArrayList();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            }
            else if (i % 3 == 0) {
                result.add("Fizz");
            }
            else if (i % 5 == 0) {
                result.add("Buzz");
            }
            else
                result.add(Integer.toString(i));
        }
        return result;
    }

    public static void main(String[] args) {
        ID412 demo = new ID412();
        System.out.println(demo.fizzBuzz(15));
    }
}
