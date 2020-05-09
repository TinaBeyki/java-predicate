import java.util.function.Predicate;

public class BiggerThanFive<T> implements Predicate<Integer> {


    @Override
    public boolean test(Integer o) {

        Integer value = 5;
        return o > value;
    }
}
