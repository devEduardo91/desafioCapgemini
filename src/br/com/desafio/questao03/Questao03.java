import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();

        System.out.println(new Anagrama(texto).quantidade());
        sc.close();
    }
}

