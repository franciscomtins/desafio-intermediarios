import java.util.Scanner;

public class ContandoNinjas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int N = sc.nextInt();
            System.out.println(log2(N));
        }
    }

    private static int log2(int N) {
        return (int) (Math.log(N) / Math.log(2));
    }

}