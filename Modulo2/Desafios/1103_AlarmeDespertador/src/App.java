import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int numMin;
        while (h1 != 0 || m1 != 0 || h2 != 0 || m2 != 0) {
            int H1 = h1 * 60 + m1;
            int H2 = h2 * 60 + m2;
            if(H2>H1){
                numMin = H2-H1;
            } else {
                numMin = (24*60-H1)+H2;
            }
            System.out.println(numMin);
            h1 = sc.nextInt();
            m1 = sc.nextInt();
            h2 = sc.nextInt();
            m2 = sc.nextInt();
        }
    }
}
