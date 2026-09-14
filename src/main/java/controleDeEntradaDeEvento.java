
import java.util.Scanner;

public class controleDeEntradaDeEvento {
    static void main() {

        Scanner sc = new Scanner(System.in);
        String nome;
        int contador;

        for (contador = 1; contador <= 10; contador++) {
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            System.out.println(nome + "Está registrado como participante " + contador);
        }
    }
}