import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x, y, raiz;

        System.out.print("Digite o valor de x --> ");
        x = sc.nextDouble();
        raiz = x * x - 25;

        if (x>=6 || x<=-6) {
            System.out.print("conta válida!");
            y = 8 / Math.sqrt(raiz);
            System.out.println("o resultado da conta é --> " +y);
        } else {
            System.out.print("conta inválida!");
        }


    }
}
