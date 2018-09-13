import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @program: LeetCode
 * @description: https://leetcode.com/problems/subdomain-visit-count/description/
 * @author: Majpyi
 * @create: 2018-05-08 16:59
 **/
public class ID811 {
    public static List<String> subdomainVisits(String[] cpdomains) {
//        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList re =new ArrayList();
        HashMap hm = new HashMap<>();
        for(String x : cpdomains){
            String[] row=x.split(" ");
            int num=Integer.parseInt(row[0]);
            String[] a =row[1].split("\\.");

            ArrayList al=new ArrayList();
            al.add(a[a.length-1]);
            for(int i=0;i<a.length-1;i++){
                StringBuffer sb =new StringBuffer();
                for(int j=i;j<a.length-1;j++)
                    sb.append(a[j]+'.');
                sb.append(a[a.length-1]);
                al.add(new String(sb));

            }


            for(Object x1 : al){
                if(hm.containsKey(x1))
                {
                    hm.replace(x1,(int)hm.get(x1)+num);
                }
                else
                hm.put(x1,num);
            }
        }
        for(Object m : hm.keySet()){
            re.add(hm.get(m)+" "+m);
        }
        return re;
    }

    public static void main(String[] args) {
        String[] a ={"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        System.out.println(subdomainVisits(a));
    }
}
