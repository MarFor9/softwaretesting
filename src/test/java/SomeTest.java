import java.util.List;
import java.util.stream.Collectors;

public class SomeTest {
    public static void main(String[] args) {
        List<String> names = List.of("Marcin", "Karol", "Kinga", "Marcela", "Kasia", "Czarek", "Zofia");

        List<String> k = names.stream()
                .filter(x -> x.startsWith("K"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        k.forEach(System.out::println);

    }
}
