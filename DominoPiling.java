import java.util.*;
 
public class DominoPiling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        
        int maxDominoes = (M * N) / 2;
        System.out.println(maxDominoes);
    }
}
