import java.util.*;

public class OrdenarNumerosParesImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numeroPares = new ArrayList<>();
        List<Integer> numerosImpares = new ArrayList<>();

        int linhas = 0;
        int numero;

        linhas = scan.nextInt();

        for(int i = 0; i < linhas; i++){
            numero = scan.nextInt();

            if (numero % 2 ==0){
                numeroPares.add(numero);
            }else{
                numerosImpares.add(numero);
            }
        }

        Collections.sort(numeroPares);
        numeroPares.forEach(System.out::println);

        numerosImpares.sort(Comparator.reverseOrder());
        numerosImpares.forEach(System.out::println);

    }
}
