import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho da escada");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println(" ".repeat(n - i) + "*".repeat(i + 1));
        }


        sc.close();
    }
}

