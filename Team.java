import java.util.Scanner;
public class Team {
 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int problemsToImplement = 0;
        
        for (int i = 0; i < n; i++) {
            int petyaSure = scanner.nextInt();
            int vasyaSure = scanner.nextInt();
            int tonyaSure = scanner.nextInt();
            
            int sureCount = petyaSure + vasyaSure + tonyaSure;
            
            if (sureCount >= 2) {
                problemsToImplement++;
            }
        }
        
        System.out.println(problemsToImplement);
        
        scanner.close();
    }
}
