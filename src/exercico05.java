import java.text.DecimalFormat;
import java.util.Scanner;

public class exercico05 {
    public static void main(String[] args) {
        DecimalFormat dc = new DecimalFormat("0,000.00");
        Scanner sc = new Scanner(System.in);
        double ValorDaHoraAula,Porcentagem;
        int TotaldeAulas;
        double salarioBruto, salarioLiquido, desconto;

        //entrada de dados
        System.out.println("Informe o total de aulas");
        TotaldeAulas = sc.nextInt();
        System.out.println(" Informe o valor da aula R$");
        ValorDaHoraAula = sc.nextDouble();
        System.out.println("Informe a porcentagem de desconto do INSS");
        Porcentagem = sc.nextDouble();

        //processamento
        salarioBruto = TotaldeAulas * ValorDaHoraAula;
        desconto = salarioBruto * Porcentagem / 100;
        salarioLiquido = salarioBruto - desconto;

        //saida de dados
        System.out.println("Salario bruto R$ " + dc.format(salarioBruto));
        System.out.println("desconto do INSS R$" + dc.format(desconto));
        System.out.println("salario liquido R$" + dc.format(salarioLiquido));



    }
}
