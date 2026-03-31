import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valortotal, desconto, valorfinal;

        System.out.print("Qual foi o valor total gasto em compras hoje? - ");
        valortotal = sc.nextDouble();


        if (valortotal>1000){
            desconto = valortotal*15/100;
        } else {
            desconto = (valortotal * 8)/100;
        }

        valorfinal = valortotal - desconto;

        System.out.println("O seu valor de compra com os descontos aplicados foi de - "+valorfinal);
    }
}
