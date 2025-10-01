import java.util.Scanner;
 
public class BitlandBitPlusPlus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int x = 0;
        
        for (int i = 0; i < n; i++) {
            String statement = scanner.next();
            
            if (statement.contains("++")) {
                x++;
            } else {
                x--;
            }
        }
        
        System.out.println(x);
        
        scanner.close();
    }
}
