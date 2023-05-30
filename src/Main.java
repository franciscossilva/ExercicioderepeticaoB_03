import java.util.Scanner;

public class SomaDeCincoNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Digite o " + i + "º número: ");
            int numero = sc.nextInt();
            soma += numero;
        }

        System.out.println("A soma dos cinco números é: " + soma);

        sc.close();
    }
}