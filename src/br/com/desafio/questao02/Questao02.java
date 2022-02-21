import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String senha = sc.next();
        String mensagem = "";

        if (senha.length() < 6) {
            mensagem += "Deve ter no mínimo 6 caracteres.  \n";
        }
        if (!senha.matches("(?=.*[A-Z]).{1,}")) {
            mensagem += "Conter no mínimo 1 letra em maiúsculo \n";
        }

        if (!senha.matches("(?=.*[a-z]).{1,}")) {
            mensagem += "Conter no mínimo 1 letra em minúsculo \n";
        }

        if (!senha.matches("(?=.[!@#$%^&()-+]).{1,}")) {
            mensagem += "Conter no mínimo 1 dos caracteres especiais !@#$%^&*()-+ \n";
        }
        System.out.println(mensagem);

        sc.close();
    }
}
