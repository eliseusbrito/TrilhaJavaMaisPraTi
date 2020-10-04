import java.util.Scanner;

public class AppFasesDaLua {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nightTwoDayAgo = sc.nextInt();
        int nightBefore = sc.nextInt();
        int delta = nightBefore - nightTwoDayAgo;
        if (nightBefore >= 0 && nightBefore <= 2) {
            System.out.println("nova");
        }
        if (nightBefore >= 3 && nightBefore <= 96 && delta > 0) {
            System.out.println("crescente");
        }
        if (nightBefore >= 97 && nightBefore <= 100) {
            System.out.println("cheia");
        }
        if (nightBefore >= 3 && nightBefore <= 96 && delta < 0) {
            System.out.println("minguante");
        }
    }
}

