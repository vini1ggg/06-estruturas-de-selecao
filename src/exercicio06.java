import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int anoatual, anobissexto, anonaobissexto;

        System.out.print("Digite o ano em que estamos atualmente para sabermos se é bissexto ou não. --> ");
        anoatual = sc.nextInt();

        if ((anoatual % 4 == 0 && anoatual % 100 != 0) || anoatual % 400 == 0) {
            System.out.println("ano bissexto!");
        } else {
            System.out.println("ano não bissexto");
        }


    }
}
