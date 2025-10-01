import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int TARGET_ROW = 3;
        final int TARGET_COL = 3;

        int currentRow = -1;
        int currentCol = -1;
        
        for (int r = 1; r <= 5; r++) {
            for (int c = 1; c <= 5; c++) {
                int value = scanner.nextInt();

                if (value == 1) {
                    currentRow = r;
                    currentCol = c;
                }
            }
        }
        
        scanner.close();

        int rowMoves = Math.abs(currentRow - TARGET_ROW);
        int colMoves = Math.abs(currentCol - TARGET_COL);
        
        int minimumMoves = rowMoves + colMoves;

        System.out.println(minimumMoves);
    }
}
