import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
 
public class IncrementalSubarray {
 
    public static void main(String[] args) {
        FastScanner fs = new FastScanner();
        PrintWriter out = new PrintWriter(System.out);
 
        int t = fs.nextInt();
        while (t-- > 0) {
            int n = fs.nextInt();
            int m = fs.nextInt();
            int[] a = new int[m];
            for (int i = 0; i < m; i++) {
                a[i] = fs.nextInt();
            }
            out.println(solve(n, m, a));
        }
 
        out.close();
    }
 
    private static long solve(int n, int m, int[] a) {
        boolean isSingleConsecutive = true;
        for (int i = 1; i < m; i++) {
            if (a[i] != a[i - 1] + 1) {
                isSingleConsecutive = false;
                break;
            }
        }
        
        if (isSingleConsecutive) {
            if (a[m - 1] > n) {
                return 0;
            }
            return (long) n - a[m - 1] + 1;
        }
        
        return 1;
    }
    
    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");
 
        String next() {
            while (!st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}
