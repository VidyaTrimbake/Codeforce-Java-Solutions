import java.util.Scanner;
 
public class SublimeSeq {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=1; i<=t; i++){
            int x = sc.nextInt();
            int n = sc.nextInt();
            if(n%2==0){
                System.out.println(0);
            }
            else{
                System.out.println(x);
            }
        }
        sc.close();
    }
}
