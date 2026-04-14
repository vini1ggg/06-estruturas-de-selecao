import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p1, p2, t1, t2, t3, mediafinal, mp, mt;

        System.out.print("digite a nota da prova 1 --> ");
        p1 = sc.nextDouble();

        System.out.print("digite a nota da prova 2 --> ");
        p2 = sc.nextDouble();

        System.out.print("digite a nota do trabalho 1 --> ");
        t1 = sc.nextDouble();

        System.out.print("digite a nota do trabalho 2 --> ");
        t2 = sc.nextDouble();

        System.out.print("digite a nota do trabalho 3 --> ");
        t3 = sc.nextDouble();

        mp = ((p1 + p2) / 2) * 0.7;
        mt = ((t1 + t2 + t3) / 3) * 0.3;
        mediafinal = mp + mt;

        System.out.println("sua média final foi de --> "+mediafinal);

        if (mediafinal >= 6) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }

    }
}
