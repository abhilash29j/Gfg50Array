import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {
    public static void main(String[] args) {
        int arr[] = {6, 6, 2, 3, 1, 4, 1, 5, 6, 2, 8, 7, 4, 2, 1, 3, 4, 5, 9, 6};
        HashMap<Integer,Boolean> map = new HashMap<>();

        for (int x : arr) {
            if (map.containsKey(x - 1)) {
                map.put(x, false);
            }
            else {
                map.put(x , true);
            }

        }
        int cur = 1;
        int max = 1;
        for(Map.Entry<Integer,Boolean> ma : map.entrySet()){
            int x = ma.getKey();
            while(map.containsKey(x + 1)) {
                cur++;
                x = x + 1;
                if (cur > max) {
                    max  = cur;
                }
            }
            cur = 1;


        }

        System.out.println(max);
     }
}
