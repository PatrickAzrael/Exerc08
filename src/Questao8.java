import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        // Entrada de dados, declaração de variáveis e Saída de dados fiz tudo junto e
        // misturado
        int hora;
        System.out.println("Informe a quantidade de horas trabalhadas no mês: ");
        hora = leia.nextInt();

        double ganho;
        System.out.println("Informe o valor que você ganha por hora trabalhada: ");
        ganho = leia.nextDouble();
        leia.close();
        double resultado;
        resultado = (ganho * hora);
        System.out.println("O total recebido no mês foi: " + resultado);

    }

}