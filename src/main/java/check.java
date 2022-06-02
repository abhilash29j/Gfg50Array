import java.util.HashMap;

public class check {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1,1);
        Object x = map.get(0);
        System.out.println(x == null);
    }
}
