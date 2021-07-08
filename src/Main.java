import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
	// write your code here
        final Integer integer_1 = 1;
        final Integer integer_2 = 2;
        final Integer integer_3 = 3;

        // soma inteiros
        final int soma = integer_1 + integer_2 + integer_3;
        // subtraçao
        final int subtracao = integer_3 - integer_2 - integer_1;
        // media
        final int media = soma / 3;
        // produto
        final int produto = integer_1 * integer_2 * integer_3;
        // maior
        final List<Integer> integerList = new ArrayList<>();
        integerList.add(integer_1);
        integerList.add(integer_2);
        integerList.add(integer_3);
        final int maior = integerList.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList())
                .stream().findFirst().orElseThrow(NullPointerException::new);
        // menor
        final int menor = integerList.stream()
                .sorted()
                .findFirst()
                .orElseThrow(NullPointerException::new);

        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("media: " + media);
        System.out.println("produto: " + produto);
        System.out.println("maior: " + maior);
        System.out.println("menor: " + menor);
    }
}
