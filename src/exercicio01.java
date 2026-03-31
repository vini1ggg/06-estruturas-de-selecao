import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double n1, n2, media;

        System.out.print("Digite sua primeira nota - ");
        n1 = sc.nextDouble();
        System.out.print("Digite sua segunda nota - ");
        n2 = sc.nextDouble();

        media= (n1+n2) /2;

        System.out.println("Sua média é de - " +media);

        if (media>= 6){
            System.out.print("aprovado!!!! 🙌");
        } else {
            System.out.print("repovado deréq! 👎");
        }

    }
}
