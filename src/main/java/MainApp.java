import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainApp {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12);
        BiggerThanFive<Integer> btf = new BiggerThanFive<>();
        numbers.stream().filter(btf).forEach(System.out:: println);

        System.out.println("***********************************************************");

        Predicate<Integer> predicate = n -> n <= 5;
        numbers.stream().filter(predicate).forEach(System.out:: println);

        System.out.println("***********************************************************");

        List<Country> countries = new ArrayList<>();
        countries.add(new Country("Iran",  80840713L));
        countries.add(new Country("Hungary", 9845000L));
        countries.add(new Country("Poland", 38485000L));
        countries.add(new Country("India", 1342512000L));
        countries.add(new Country("Latvia", 1978000L));
        countries.add(new Country("Vietnam", 95261000L));
        countries.add(new Country("Sweden", 9967000L));
        countries.add(new Country("Iceland", 337600L));
        countries.add(new Country("Israel", 8622000L));

        Predicate<Country> predicate1 = p -> p.getPopulation() < 80840713L;
        countries.stream().filter(predicate1).forEach(System.out:: println);

        System.out.println("***********************************************************");

        System.out.println("all list members:");
        List<Integer> all = eval(numbers, n -> true);
        all.forEach(System.out::println);

        System.out.println("all even members:");
        List<Integer> evens = eval(numbers, n -> (n % 2 == 0));
        evens.forEach(System.out::println);

        System.out.println("all odd numbers:");
        List<Integer> odds = eval(numbers, n -> (n % 2 != 0));
        odds.forEach(System.out::println);

    }

    public static List<Integer> eval(List<Integer> list, Predicate<Integer> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
