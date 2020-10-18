import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int cont = 0;
        while (x != 0) {
            List<Integer> list = new ArrayList<>();
            List<Integer> listSinais = new ArrayList<>();
            cont = 0;
            for (int i = 0; i < x; i++) {
                int h = sc.nextInt();
                list.add(h);
            }
            int r = list.get(0);
            list.add(r);
            for (int i = 0; i < list.size() - 1; i++) {
                int h1 = list.get(i + 1) - list.get(i);
                listSinais.add(h1);
            }
            listSinais.add(listSinais.get(0));
            for (int i = 0; i < listSinais.size() - 1; i++) {
                String i0;
                String i1;
                if (listSinais.get(i) > 0) {
                    i0 = "P";
                } else {
                    i0 = "N";
                }
                if (listSinais.get(i + 1) > 0) {
                    i1 = "P";
                } else {
                    i1 = "N";
                }
                if (i0 != i1) {
                    cont = cont + 1;
                }
            }
            System.out.println(cont);
            x = sc.nextInt();
        }
    }
}
