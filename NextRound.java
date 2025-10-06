import java.util.*;
 
public class NextRound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int kthScore = a[k - 1];
        int count = 0;
        
        for (int score : a) {
            if (score >= kthScore && score > 0) {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
