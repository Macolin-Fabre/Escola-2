import java.sql.SQLOutput;
import java.util.Scanner;

public class exercicio_01 {
    /*Crie um programa onde o usuário ira digitar 3 números quaisquer (não serão digitados números
repetidos), o programa deverá ter um método que deverá retornar uma mensagem com o maior
número par digitado e caso não tenha sido digitado um número par deve avisar. */
    public static void main(String[] args) {
        int num1, num2, num3, maior;

        Scanner leia = new Scanner(System.in);
        System.out.println("digite o primeiro numero: ");
        num1 = leia.nextInt();
        System.out.println("digite o segundo numero: ");
        num2 = leia.nextInt();
        System.out.println("digite o terceiro numero; ");
        num3 = leia.nextInt();
        maior = maiorNumero(num1, num2, num3);
        System.out.println("o maior numero é");


    }

    public static int maiorNumero(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3 && n1 % 2 == 0) {
            return n1;

        } else if (n2 > n3 && n2 % 2 == 0) {
            return n2;

        } else if(n3 % 2 == 0) {
            return n3;


        }
    }
}






