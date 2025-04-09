import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio602 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
                double x , y, aux;
        System.out.println("Informe o valor de x -->");
        x = sc.nextInt();

        aux = (Math.pow(x, 4) - 1) / (2 * Math.pow(x, 2));


        y = Math.sqrt(1 + aux * aux) - Math.pow(x,2) / 2;


        System.out.println("y = " + df.format(y));


    }
}
