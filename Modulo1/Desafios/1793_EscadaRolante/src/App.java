import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int amongTime = 10;
        int contador = 0;
        List<Integer> listaInstantes = new ArrayList<>();
        List<Integer> listaSaida = new ArrayList<>();
        int numPessoas = sc.nextInt();
        while (numPessoas > 0) {
            for (int i = 0; i < numPessoas; i++) {
                int instante = sc.nextInt();
                listaInstantes.add(instante);
            }
            for (int i = 0; i < listaInstantes.size(); i++) {
                if (i == 0) {
                    contador = amongTime;
                } else {
                    int deltaTempoAtualAnterior = listaInstantes.get(i).intValue() - listaInstantes.get(i - 1).intValue();
                    if (deltaTempoAtualAnterior < amongTime) {
                        contador += deltaTempoAtualAnterior;
                    } else {
                        contador += amongTime;
                    }
                }
            }
            listaSaida.add(contador);
            listaInstantes.clear();
            numPessoas = sc.nextInt();
        }
        for (int i = 0; i < listaSaida.size(); i++) {
            System.out.println(listaSaida.get(i));
        }
    }
}
