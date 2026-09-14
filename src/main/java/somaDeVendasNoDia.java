import java.util.Scanner;

public class somaDeVendasNoDia {
    static void main() {

        Scanner sc = new Scanner(System.in);
        double venda, soma =0;

        for (int contador = 1; contador <= 5; contador++) {
            System.out.println("Informe o valor da sua venda: ");
            venda = sc.nextDouble();
            soma += venda;
            System.out.println("A soma da sua compra é: " + soma);
        }
    }
}