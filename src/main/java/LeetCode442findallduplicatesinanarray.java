import java.util.ArrayList;
import java.util.List;

public class LeetCode442findallduplicatesinanarray {
    public static void main(String[] args) {
        int num[] = {4,4,2,8,8,2,3,1};
        List<Integer> list = new ArrayList<>();
        int len = num.length;
        for (int i = 0; i < len; i++) {
           int x = num[Math.abs(num[i]) - 1];
           if (x < 0) {
               list.add(Math.abs(num[i]));
           }
           else
            num[Math.abs(num[i]) - 1] *= -1;

        }
        System.out.println(list);
    }
}
