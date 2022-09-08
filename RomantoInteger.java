// Convert Roman letters to Integers


import java.util.*;

public class romantointeg {

    static int rtoint(String r){

        Map<Character, Integer> map = new HashMap<>();
        map.put('I',1); map.put('L', 50);
        map.put('V',5); map.put('X',10);
        map.put('C', 100); map.put('D', 500);
        map.put('M', 1000);

        int count = 0;

        for(int i=0;i<r.length()-1;i++){
            if(map.get(r.charAt(i)) >= map.get(r.charAt(i+1)))
                count += map.get(r.charAt(i));
                

            else
                count -= map.get(r.charAt(i));

        }
        count += map.get(r.charAt(r.length()-1));

        System.out.println(count);
        return count;
    }
    
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        String r = s.next();

        int c = rtoint(r);
    }
}
