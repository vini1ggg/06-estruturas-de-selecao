import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1, l2, l3;
        int l12, l23, l13;

        System.out.print("Digite o valor do lado 1 --> ");
        l1 = sc.nextInt();

        System.out.print("Digite o valor do lado 2 --> ");
        l2 = sc.nextInt();

        System.out.print("Digite o valor do lado 3 --> ");
        l3 = sc.nextInt();

        l12 = l1 + l2;
        l23 = l2 + l3;
        l13 = l1 + l3;

            if (l23 < l1) {
                System.out.println("Valor 1 inválido para o triângulo");
            } else {
                System.out.println("Valor 1 válido para o triângulo");
            }
            if (l13 < l2) {
                System.out.println("Valor 2 inválido para o triângulo");
            } else {
                System.out.println("Valor 2 válido para o triângulo");
            }
            if (l12 < l3) {
                System.out.println("Valor 3 inválido para o triângulo");
            } else {
                System.out.println("Valor 3 válido para o triângulo");
            }



    }
}
