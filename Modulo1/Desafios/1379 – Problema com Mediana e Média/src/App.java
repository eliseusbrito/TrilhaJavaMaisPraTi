import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a != 0 && b != 0){
            int c = a-(b-a);
            System.out.println(c);
            a = sc.nextInt();
            b = sc.nextInt();
        }
    }
}
