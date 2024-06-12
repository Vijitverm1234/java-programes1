import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
public class StreamApi {
    public static void main(String[] args) {
        List<Integer> nums=Arrays.asList(2,3,1,6,2,3);
        Stream<Integer> Data=nums.stream();
        Stream<Integer>UpdatedData=Data.sorted().map(n->(n*10));
        UpdatedData.forEach(n->System.out.println(n));
        int sum=nums.stream().reduce(0,(c,e)->(c+e));
        System.out.println(sum);
    }
}
