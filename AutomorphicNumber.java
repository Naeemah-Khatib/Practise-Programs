import java.util.*; 
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	  
	    String st = String.valueOf(n);
	    int len = st.length();
	    int sq = n*n;
	    String sqt = String.valueOf(sq);
	 /*   if (sqt.regionMatches(sqt.length()-len, st, 0, len)) 
	         System.out.println("Yes");
	      else
	        System.out.println("No");
	    --OR--     */
	    String sub = sqt.substring(sqt.length()-len);
	    if(sub.equals(st))
	        System.out.println("Yes");
	    else
	        System.out.println("No");
	}
}
