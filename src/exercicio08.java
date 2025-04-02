import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Numero,Dezena;

        System.out.println("Digite um numero com 3 valores");
        Numero = sc.nextInt();

        Dezena = (Numero/ 10) % 10;
        System.out.println("O valor da dezena é " + Dezena);


    }
}
