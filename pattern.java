/*
  A B C D
  B C D E
  C D E F
  D E F G
*/

public class just {
    public static void main(String[] args) {
        int n = 4;
        printpat(n);
    }

    private static void printpat(int n) {
        
        for(int i=1;i<=n;i++){
            
            for(int j=1;j<=n;j++){
                System.out.print((char)('A'+j-2+i)+" ");
                
            }
            System.out.println();
        }
    }
}
