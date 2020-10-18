import java.io.*;
import java.text.DecimalFormat;
import java.util.Locale;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class App {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);
        BufferedReader in;
        StringBuilder out = new StringBuilder();
        File file = new File("in");
        if (file.exists())
            in = new BufferedReader(new FileReader(file));
        else
            in = new BufferedReader(new InputStreamReader(System.in));
        Double totalKg = 0.00;
        Double totalGasto = 0.00;
        int n = parseInt(in.readLine());
        for (int i = 1; i <= n; i++) {
            Double gasto = parseDouble(in.readLine());
            int numProduto = in.readLine().split(" ").length;
            System.out.println("day " + i + ": " + numProduto + " kg");
            totalKg = numProduto + totalKg;
            totalGasto += gasto;
        }
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println(df.format(totalKg / n) + " kg by day");
        System.out.println("R$ " + df.format(totalGasto / n) + " by day");
    }
}

