import java.util.Scanner;

public class LexicographicalComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        
        if (str1.compareTo(str2) < 0) {
            System.out.println("-1");
        } else if (str1.compareTo(str2) > 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
        
        scanner.close();
    }
}
