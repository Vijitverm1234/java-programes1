import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamApi1 {
    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(1,2,3,4,2,1);
         Stream<Integer> Data=list.stream();
         Data.map(n->(n*2)).sorted().forEach(System.out::println);
         Stream<Integer> data1=list.stream();
         System.out.println(data1.reduce((c,d)->c+d));
    }
}
