import java.util.Scanner;

public class pesquisaDeSatisfacao {
    static void main() {

        Scanner sc = new Scanner(System.in);
        int nota, contador = 0;

        while (contador < 10) {
            contador++;
            System.out.println("Cliente n." + contador + ", avalie a nossa loja!");
            nota = sc.nextInt();
        }
        System.out.println(contador + "Clientes avaliaram nossa loja");
    }
}