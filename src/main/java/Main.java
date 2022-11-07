import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList();
        list.add("korea");
        list.add("japan");
        list.add("france");
        Stream<String> stream = list.stream();
        stream.map(str -> str.toUpperCase())
                .forEach(it -> System.out.println(it));
    }
}