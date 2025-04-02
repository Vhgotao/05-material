import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Valor,Yvalor,centena,dezena,unidade;

        System.out.println("Digite um valor de 3 digitos (100 - 999) ");
        Valor = sc.nextInt();

       dezena = Valor % 100 / 10;
        unidade = Valor % 10;
        centena = Valor / 100;
     Yvalor = unidade * 100 + dezena * 10 + centena;
        System.out.println(Yvalor);
    }
}
