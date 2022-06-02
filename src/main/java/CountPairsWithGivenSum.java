import java.util.HashMap;
import java.util.Map;

public class CountPairsWithGivenSum {
    public static void main(String[] args) {

        int arr[] = {1,5,7,1};
        int k = 6;
        int count = 0;
        Map<Integer,Integer> map = new HashMap<>();
        int len = arr.length;

        for (int x : arr) {
            if(map.containsKey(k - x)) {
                count += map.get(k - x);
            map.put(x,map.getOrDefault(x,0) + 1);
            }
            else
                map.put(x,map.getOrDefault(x,0) + 1);
        }
        System.out.println(count);



    }
}
