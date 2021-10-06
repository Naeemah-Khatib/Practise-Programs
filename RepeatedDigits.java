// Given n1 and n2, display the count of numbers within this range with no repeative digits

import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int count =0;
        for(int i=n1;i<=n2;i++){
            boolean[] visited = new boolean[10];
            
            int num = i;
            while(num>0){
                if(visited[num%10] == true)
                    break;
                visited[num%10] = true;
                num /= 10;
            }
            if(num==0)
                count++;
            
        }	
        System.out.println(count);
	}
}


// 2nd method - use Set
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		int count=0;
		for(int i=n1;i<=n2;i++){
		    int num=i;
		    TreeSet<Integer> set = new TreeSet<Integer>();
		    while(num>0){
		        set.add(num%10);
		        num /= 10;
		    }
		    if(set.size() == String.valueOf(i).length()) count++;
		}
		System.out.print(count);
	}
}
