import java.util.Scanner;

public class EmbaralharStrings {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int N = leitor.nextInt();

        String palavra1 = " ";
        String palavra2 = " ";

        for (int i = 0; i < N; i++) {
            palavra1 = leitor.next();
            palavra2 = leitor.next();

            combinar(palavra1,palavra2);
        }

    }
        private static void combinar(String p1, String p2) {
            String combinacao = "";
            for (int i = 0; i < p1.length(); i++) {
                combinacao += String.valueOf(p1.charAt(i)) + String.valueOf(p2.charAt(i));
            }

            System.out.println(combinacao);
        }

}
