import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws IOException {
        String nome = "c://temp//livros.txt";
        try {
            System.setIn(new FileInputStream(new File(nome)));
        } catch (
                FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
        }
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        List<String> sortedList;
        while (sc.hasNext()) {
            int numeroLivros = sc.nextInt();
            for (int i = 0; i < numeroLivros; i++) {
                String codigos = sc.next();
                list.add(codigos);
            }
            sortedList = list.stream().sorted().collect(Collectors.toList());
            for (int i = 0; i < sortedList.size(); i++) {
                System.out.println(sortedList.get(i));
            }
            list.clear();
        }

    }
}