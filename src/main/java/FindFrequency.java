import java.util.HashMap;

public class FindFrequency {
    public static void main(String[] args) {
        int arr[] = new int[] {1,2,3,1,1,2,1};
        int x = 1;
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i] , 0) + 1);

        }
        System.out.println(map.get(5));
    }
}
