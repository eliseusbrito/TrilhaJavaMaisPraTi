import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        String nome = "c://temp//cpf.txt";
        try {
            System.setIn(new FileInputStream(new File(nome)));
        } catch (
                FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String cpf = sc.next();
            System.out.println(cpf.substring(0, 3));
            System.out.println(cpf.substring(4, 7));
            System.out.println(cpf.substring(8, 11));
            System.out.println(cpf.substring(12, 14));
        }
    }
}
