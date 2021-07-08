import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Strings {

    public static void main(String[] args) {
	// write your code here
        final var string_1 = "uma";
        final var string_2 = "duas";
        final var string_3 = "tress";
        final var string_4 = "quarta";
        final var string_5 = "quintas";
        final var stringList = List.of(string_1, string_2, string_3, string_4, string_5);
        // exercicio a)
        System.out.println("Lista inicial:");
        stringList.forEach(System.out::println);

        // exercicio b)
        final var listaInvertida = stringList
                .stream()
                .sorted(Comparator.comparing(String::length).reversed())
                .collect(Collectors.toList());
        System.out.println("Lista invertida com stream:");
        listaInvertida.forEach(System.out::println);

        final var listaInvertidaHardMode = new ArrayList<String>();
        for (int i = stringList.size()-1; i >= 0; i--) {
            listaInvertidaHardMode.add(stringList.get(i));
        }
        System.out.println("Lista invertida hard mode:");
        listaInvertidaHardMode.forEach(System.out::println);

        // exercicio c)
        final var maiorString = listaInvertida
                .stream()
                .findFirst().orElse("String não presente");
        System.out.println("String com maior tamanho: " + maiorString);
    }
}
